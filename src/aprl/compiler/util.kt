package aprl.compiler

import aprl.AprlParser
import aprl.compiler.jvm.*
import aprl.lang.Complex
import org.antlr.v4.runtime.ParserRuleContext
import java.lang.NumberFormatException
import java.lang.reflect.*
import java.lang.reflect.Constructor
import java.lang.reflect.Type as JType
import java.math.BigDecimal
import java.math.BigInteger

@Suppress("DEPRECATION")
fun loadPackage(string: String): Package? {
    return Package.getPackage(string)
}

private fun loadClass(string: String): Class<*>? {
    return try {
        Class.forName(string)
    } catch (ex: ClassNotFoundException) {
        null
    }
}

fun loadCompleteClass(string: String): Class<*>? {
    return loadCompleteClass(string.split(".").toMutableList(), mutableListOf())
}

private fun loadCompleteClass(identifiers: MutableList<String>, subIdentifiers: MutableList<String>): Class<*>? {
    if (identifiers.isEmpty()) {
        return null
    }
    val subIdentifierString = if (subIdentifiers.isEmpty()) "" else "$" + subIdentifiers.reversed().joinToString("$")
    val string = identifiers.joinToString(".") + subIdentifierString
    val last = identifiers.removeAt(identifiers.lastIndex)
    return loadClass(string) ?: loadCompleteClass(identifiers, (subIdentifiers + last).toMutableList())
}

fun loadMethod(clazz: Class<*>, methodName: String) = clazz.methods.firstOrNull { it.name == methodName }
fun loadMethods(clazz: Class<*>, methodName: String) = clazz.methods.filter { it.name == methodName }

fun loadNestedClass(clazz: Class<*>, className: String) = clazz.classes.firstOrNull { it.name == className }
fun loadNestedClasses(clazz: Class<*>, className: String) = clazz.classes.filter { it.name == className }

fun loadField(clazz: Class<*>, fieldName: String) = clazz.fields.firstOrNull { it.name == fieldName }
fun loadFields(clazz: Class<*>, fieldName: String) = clazz.fields.filter { it.name == fieldName }

fun faultyIdentifier(identifiers: List<AprlParser.SimpleIdentifierContext>): AprlParser.SimpleIdentifierContext {
    val currentIdentifiers = mutableListOf<String>()
    var lastValidIndex = 0
    for ((i, id) in identifiers.map { it.text }.withIndex()) {
        currentIdentifiers.add(id)
        val currentString = currentIdentifiers.joinToString(".")
        lastValidIndex = if (loadCompleteClass(currentString) != null || loadPackage(currentString) != null) i else break
    }
    return identifiers.getOrNull(lastValidIndex + 1) ?: throw InternalError("faultyIdentifier() was called despite no faulty identifiers")
}

val ParserRuleContext.position: Position get() = start.line to start.charPositionInLine + 1

operator fun Position.plus(b: Int): Position = first to second + b

operator fun Position.minus(b: Int): Position = first to second - b

inline fun <reified T> List<T>.asArray(): Array<T> = Array(this.size) {
    this[it]
}

fun <A, B> List<A>.pair(other: List<B>): List<Pair<A, B>> {
    if (size != other.size) {
        throw UnsupportedOperationException("Cannot pair lists of unlike sizes")
    }
    return mapIndexed { i, it -> Pair(it, other[i]) }
}

fun <A, B> List<A>.pair(other: Array<B>): List<Pair<A, B>> {
    if (size != other.size) {
        throw UnsupportedOperationException("Cannot pair lists of unlike sizes")
    }
    return mapIndexed { i, it -> Pair(it, other[i]) }
}

fun <A, B> Array<A>.pair(other: List<B>): List<Pair<A, B>> {
    if (size != other.size) {
        throw UnsupportedOperationException("Cannot pair lists of unlike sizes")
    }
    return mapIndexed { i, it -> Pair(it, other[i]) }
}

fun <A, B> Array<A>.pair(other: Array<B>): List<Pair<A, B>> {
    if (size != other.size) {
        throw UnsupportedOperationException("Cannot pair lists of unlike sizes")
    }
    return mapIndexed { i, it -> Pair(it, other[i]) }
}

fun <T> List<T>.anyIndexed(predicate: (Int, T) -> Boolean): Boolean {
    for (i in 0 until this.size) {
        if (predicate(i, this[i])) {
            return true
        }
    }
    return false
}

fun <T> Array<T>.anyIndexed(predicate: (Int, T) -> Boolean): Boolean {
    for (i in 0 until this.size) {
        if (predicate(i, this[i])) {
            return true
        }
    }
    return false
}

fun <T> List<T>.allIndexed(predicate: (Int, T) -> Boolean): Boolean {
    for (i in 0 until this.size) {
        if (!predicate(i, this[i])) {
            return false
        }
    }
    return true
}

fun <T> Array<T>.allIndexed(predicate: (Int, T) -> Boolean): Boolean {
    for (i in 0 until this.size) {
        if (!predicate(i, this[i])) {
            return false
        }
    }
    return true
}

inline fun <T, R> Collection<T>.mapMutable(transform: (T) -> R): MutableList<R> = map(transform).toMutableList()

inline fun <T, R> Collection<T>.mapSet(transform: (T) -> R): Set<R> = map(transform).toSet()

inline fun <T, reified R> Collection<T>.mapArray(transform: (T) -> R): Array<R> = map(transform).toTypedArray()

inline fun <T, R> Collection<T>.mapIndexedMutable(transform: (Int, T) -> R): MutableList<R> = mapIndexed(transform).toMutableList()

inline fun <T, R> Collection<T>.flatMapMutable(transform: (T) -> Iterable<R>): MutableList<R> = flatMap(transform).toMutableList()

fun <T> Collection<T>.reversedMutable(): MutableList<T> = reversed().toMutableList()

infix fun <T> Collection<T>.andMaybe(element: T?) = element?.let { this + it } ?: this

infix fun <T> List<T>.andMaybe(element: T?) = element?.let { this + it } ?: this

infix fun <T> Set<T>.andMaybe(element: T?) = element?.let { this + it } ?: this

@Throws(NumberFormatException::class)
fun String.decodeWholeNumber(): BigInteger {
    return if (startsWith("-")) {
        -removePrefix("-").decodeWholeNumber()
    } else {
        drop(2).replace("_", "").let {
            if (startsWith("0x", true)) {
                BigInteger(it, 16)
            } else if (startsWith("0b", true)) {
                BigInteger(it, 2)
            } else if (startsWith("0o", true)) {
                BigInteger(it, 8)
            } else {
                BigInteger(this)
            }
        }
    }
}

fun String.decodeWholeNumberOrNull(): BigInteger? {
    return tryOrNull { decodeWholeNumber() }
}

fun String.decodeDecimalNumber(): BigDecimal {
    TODO("String.decodeDecimalNumber()")
}

fun String.decodeDecimalNumberOrNull(): BigDecimal? {
    TODO("String.decodeDecimalNumberOrNull()")
}

fun String.decodeComplexNumber(): Complex {
    val (realStr, imaginaryStr) = split("j", ignoreCase = true).run { get(0) to get(1) }
    val real = if ("." in realStr) realStr.decodeDecimalNumber() else realStr.decodeWholeNumber().toBigDecimal()
    val imaginary = if ("." in imaginaryStr) imaginaryStr.decodeDecimalNumber() else imaginaryStr.decodeWholeNumber().toBigDecimal()
    return Complex(real, imaginary)
}

fun String.decodeComplexNumberOrNull(): Complex? {
    return tryOrNull { decodeComplexNumber() }
}

fun <T> tryOrNull(action: () -> T): T? {
    return try {
        action()
    } catch (ex: Throwable) {
        null
    }
}

fun <T, R> Collection<Pair<T, R>>.split(): Pair<Collection<T>, Collection<R>> {
    return map { it.first } to map { it.second }
}

fun <T, R> Set<Pair<T, R>>.split(): Pair<Set<T>, Set<R>> {
    return mapSet { it.first } to mapSet { it.second }
}

fun <T, R> List<Pair<T, R>>.split(): Pair<List<T>, List<R>> {
    return map { it.first } to map { it.second }
}

fun <T> List<T>.indicesWhere(predicate: (T) -> Boolean): List<Int> {
    val indices = mutableListOf<Int>()
    for ((i, item) in withIndex()) {
        if (predicate(item)) {
            indices.add(i)
        }
    }
    return indices
}

fun JType.toType(): Type {
    return when (this) {
        is Class<*> -> {
            ClassType(this, null)
        }
        is ParameterizedType -> {
            ClassType(toPlainClass(), jTypeArgumentsToTypeArguments(actualTypeArguments))
        }
        is GenericArrayType -> {
            return ArrayType(type = genericComponentType.toType())
        }
        else -> {
            throw InternalError("Didn't expect type $this to be ${javaClass.name}")
        }
    }
}

private fun jTypeArgumentsToTypeArguments(typeArguments: Array<out JType>): TypeArgument {
    return TypeArgument(typeArguments.map { TypeProjection(type = it.toType()) })
}

fun JType.toPlainClass(): Class<*> {
    return when (this) {
        is Class<*> -> this
        is ParameterizedType -> this.rawType as Class<*>
        else -> throw InternalError("Didn't expect $this to be ${this.javaClass.name}")
    }
}

fun JType.toPlainClassOrNull(): Class<*>? {
    return when (this) {
        is Class<*> -> this
        is ParameterizedType -> this.rawType as Class<*>
        else -> null
    }
}

val AccessibleObject.type: Type get() = when (this) {
    is Constructor<*> -> declaringClass.toType()
    is Field -> genericType.toType()
    is Method -> genericReturnType.toType()
    else -> throw InternalError("Didn't expect AccessibleObject to be ${javaClass.name}")
}

fun <T> List<T>.dropSurrounding(n: Int): List<T> = drop(n).dropLast(n)

fun <T> Array<T>.dropSurrounding(n: Int): List<T> = drop(n).dropLast(n)

fun <T> List<List<T>>.allAt(index: Int): List<T> {
    return map { it[index] }
}

val <T> List<T>.allEqual: Boolean
    get() = all { it == first() }

val <T> Class<T>.classHierarchy: List<Class<in T>>
    get() = superclass?.classHierarchy?.plus(this) ?: listOf(this)

fun <T> List<T>.contentEquals(other: List<T>): Boolean {
    return size == other.size && zip(other).all { it.first == it.second }
}

fun <T> T.asList(): List<T> = listOf(this)
