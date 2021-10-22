package aprl.compiler

import aprl.AprlParser
import aprl.compiler.jvm.Annotations
import aprl.compiler.jvm.Modifier
import org.antlr.v4.runtime.ParserRuleContext
import java.util.*

fun modifiersFromModifierList(ctx: AprlParser.ModifierListContext): ArrayList<Modifier> {
    val modifiers = ArrayList<Modifier>()
    for (modifier in ctx.modifier()) {
        val visibility = modifier.visibilityModifier()
        val inheritance = modifier.inheritanceModifier()
        val parameter = modifier.parameterModifier()
        val function = modifier.functionModifier()
        val actualModifier: Modifier = if (visibility != null) {
            if (visibility.PUBLIC() != null) Modifier.PUBLIC
            else if (visibility.LOCAL() != null) Modifier.LOCAL
            else if (visibility.BOUNDED() != null) Modifier.BOUNDED
            else if (visibility.PRIVATE() != null) Modifier.PRIVATE
            else throw InternalError("Expected VisibilityModifierContext ($visibility) to be PUBLIC, LOCAL, BOUNDED or PRIVATE")
        } else if (inheritance != null) {
            if (inheritance.SAMPLE() != null) Modifier.SAMPLE
            else if (inheritance.FINAL() != null) Modifier.FINAL
            else if (inheritance.OPEN() != null) Modifier.OPEN
            else if (inheritance.COVER() != null) Modifier.COVER
            else throw InternalError("Expected InheritanceModifierContext ($inheritance) to be SAMPLE, FINAL, OPEN or COVER")
        } else if (parameter != null) {
            if (parameter.PARAMS() != null) Modifier.PARAMS
            else throw InternalError("Expected ParameterModifierContext ($parameter) to be PARAMS")
        } else if (function != null) {
            if (function.INLINE() != null) Modifier.INLINE
            else if (function.SYNC() != null) Modifier.SYNC
            else if (function.EXTERNAL() != null) Modifier.EXTERNAL
            else throw InternalError("Expected ")
        } else {
            throw InternalError("Expected ModifierContext ($modifier) to have visibilityModifier, inheritanceModifier, parameterModifier or functionModifier")
        }
        modifiers.add(actualModifier)
    }
    return modifiers
}

fun annotationsFromModifierList(ctx: AprlParser.ModifierListContext): Annotations {
    TODO("Not yet implemented")
}

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

fun <T, R> Array<T>.mapMutable(transform: (T) -> R): MutableList<R> = map(transform).toMutableList()

fun <T, R> List<T>.flatMapMutable(transform: (T) -> Iterable<R>): MutableList<R> = flatMap(transform).toMutableList()

fun <T, R> Array<T>.flatMapMutable(transform: (T) -> Iterable<R>): MutableList<R> = flatMap(transform).toMutableList()

fun <T> List<T>.reversedMutable(): MutableList<T> = reversed().toMutableList()

fun <T> Array<T>.reversedMutable(): MutableList<T> = reversed().toMutableList()
