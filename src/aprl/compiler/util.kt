package aprl.compiler

import aprl.AprlParser
import aprl.lang.Complex
import aprl.lang.Trilean
import org.antlr.v4.runtime.ParserRuleContext
import java.lang.NumberFormatException
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

val ParserRuleContext.position: Pair<Int, Int>
    get() = Pair(start.line, start.charPositionInLine + 1)

operator fun Pair<Int, Int>.plus(b: Int) = Pair(first, second + b)

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

fun <T, R> List<T>.mapMutable(transform: (T) -> R): MutableList<R> = map(transform).toMutableList()

fun <T, R> List<T>.mapIndexedMutable(transform: (Int, T) -> R): MutableList<R> = mapIndexed(transform).toMutableList()

fun <T, R> List<T>.flatMapMutable(transform: (T) -> Iterable<R>): MutableList<R> = flatMap(transform).toMutableList()

fun <T> List<T>.reversedMutable(): MutableList<T> = reversed().toMutableList()

infix fun <T> List<T>.andMaybe(element: T?) = element?.let { this + it } ?: this

fun String.toTrilean(): Trilean = when(this) {
    "true" -> Trilean.TRUE
    "false" -> Trilean.FALSE
    "none" -> Trilean.NONE
    else -> throw IllegalArgumentException("The string doesn't represent a boolean value: $this")
}

fun String.toTrileanOrNull(): Trilean? = when (this) {
    "true" -> Trilean.TRUE
    "false" -> Trilean.FALSE
    "none" -> Trilean.NONE
    else -> null
}

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
