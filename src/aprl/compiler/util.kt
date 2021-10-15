package aprl.compiler

import aprl.AprlParser
import aprl.compiler.jvm.Annotation
import aprl.compiler.jvm.Import
import aprl.compiler.jvm.Modifier
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.TerminalNode
import java.lang.reflect.Field
import java.lang.reflect.Method
import java.util.*

fun namespaceMatchesLocation(ctx: AprlParser.NamespaceHeaderContext, filePath: String): Boolean {
    val identifier = ctx.identifier()!!
    val simpleIdentifiers = ArrayList(identifier.simpleIdentifier()!!.reversed())
    val subFolders = LinkedList(filePath.split("\\").reversed()).also { it.pop() }
    for (id in simpleIdentifiers) {
        if (id.Identifier().symbol.text != subFolders.pop()) {
            return false
        }
    }
    return true
}

fun modifiersFromModifierList(ctx: AprlParser.ModifierListContext): List<Modifier> {
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
            if (function.DIRECT() != null) Modifier.DIRECT
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

fun annotationsFromModifierList(ctx: AprlParser.ModifierListContext): List<Annotation> {
    TODO("Not yet implemented")
}

@Suppress("DEPRECATION")
fun loadPackage(string: String): Package? {
    return Package.getPackage(string)
}

fun loadClass(string: String): Class<*>? {
    return try {
        Class.forName(string)
    } catch (ex: ClassNotFoundException) {
        null
    }
}

fun loadMethod(clazz: Class<*>, methodName: String): Method? {
    for (method in clazz.methods) {
        if (method.name == methodName) {
            return method
        }
    }
    return null
}

fun loadNestedClass(clazz: Class<*>, className: String): Class<*>? {
    for (innerClass in clazz.classes) {
        if (innerClass.name == className) {
            return innerClass
        }
    }
    return null
}

fun loadField(clazz: Class<*>, fieldName: String): Field? {
    for (field in clazz.fields) {
        if (field.name == fieldName) {
            return field
        }
    }
    return null
}

fun lastValidClass(identifiers: List<String>): Class<*>? {
    val currentIdentifiers = ArrayList<String>()
    var lastValidClass: Class<*>? = null
    for (id in identifiers) {
        currentIdentifiers.add(id)
        val currentString = currentIdentifiers.joinToString(".")
        lastValidClass = loadClass(currentString) ?: lastValidClass
    }
    return lastValidClass
}

fun lastValidPackage(identifiers: List<String>): Package? {
    val currentIdentifiers = ArrayList<String>()
    var lastValidPackage: Package? = null
    for (id in identifiers) {
        currentIdentifiers.add(id)
        val currentString = currentIdentifiers.joinToString(".")
        lastValidPackage = loadPackage(currentString) ?: lastValidPackage
    }
    return lastValidPackage
}

fun <T> nextElement(elements: List<T>, element: T): Pair<Int, T>? {
    for ((i, el) in elements.withIndex()) {
        if (el == element) {
            return try {
                Pair(i + 1, elements[i + 1])
            } catch (ex: IndexOutOfBoundsException) {
                null
            }
        }
    }
    return null
}

val ParserRuleContext.position: Pair<Int, Int>
    get() = Pair(start.line, start.charPositionInLine + 1)
