package aprl.compiler.verification

import aprl.compiler.Scope
import aprl.compiler.asArray
import aprl.compiler.psi.INVALID
import aprl.compiler.psi.Position
import aprl.compiler.psi.aprl.FunctionDeclaration
import aprl.compiler.psi.aprl.Named
import aprl.compiler.psi.java.*
import aprl.compiler.psi.java.Modifier.RawModifier
import aprl.compiler.toPlainClass
import aprl.compiler.toType
import java.lang.reflect.*
import java.lang.reflect.Modifier as JModifier
import java.lang.reflect.Parameter as JParameter

fun Type.getFunctionsByName(name: String, scope: Scope<Named>): List<MethodDeclaration> {
    val intrinsics = when (this) {
        is Class<*> -> methods.filter { it.name == name }.map { it.asMethodDeclaration() }
        is GenericArrayType -> Array::class.java.getFunctionsByName(name, scope)
        is ParameterizedType -> listOf()
        is TypeVariable<*> -> intersection(*bounds.map { it.getFunctionsByName(name, scope) }.asArray())
        is WildcardType -> if (upperBounds.isEmpty()) Object::class.java.getFunctionsByName(name, scope) else upperBounds.map { it.getFunctionsByName(name, scope) }
        else -> throw InternalError("Didn't expect java.lang.Type to be ${this::class.qualifiedName}")
    }
    val extensions = scope.members.filterIsInstance<FunctionDeclaration>().map { it.asMethodDeclaration(scope) }
    TODO("")
}

fun Method.asMethodDeclaration(): MethodDeclaration {
    val modifiers = modifiersToModifierList(modifiers, annotations)
    val typeParameters = typeParameters.map { it.asTypeParameter() }
    val name = SimpleIdentifier(INVALID, name)
    val parameters = parameters.map { it.asMethodValueParameter() }
    val returnType = genericReturnType
    val body = Block.empty()
    return MethodDeclaration(INVALID, modifiers, typeParameters, name, parameters, returnType, body)
}

fun modifiersToModifierList(modifiers: Int, annotations: Array<Annotation>): ModifierList {
    val modifierList = mutableListOf<RawModifier>()
    if (JModifier.isPublic(modifiers)) {
        modifierList.add(RawModifier.PUBLIC)
    }
    if (JModifier.isProtected(modifiers)) {
        modifierList.add(RawModifier.PROTECTED)
    }
    if (JModifier.isPrivate(modifiers)) {
        modifierList.add(RawModifier.PRIVATE)
    }
    if (JModifier.isStatic(modifiers)) {
        modifierList.add(RawModifier.STATIC)
    }
    if (JModifier.isAbstract(modifiers)) {
        modifierList.add(RawModifier.ABSTRACT)
    }
    if (JModifier.isFinal(modifiers)) {
        modifierList.add(RawModifier.FINAL)
    }
    if (JModifier.isStrict(modifiers)) {
        modifierList.add(RawModifier.STRICTFP)
    }
    if (JModifier.isNative(modifiers)) {
        modifierList.add(RawModifier.NATIVE)
    }
    if (JModifier.isSynchronized(modifiers)) {
        modifierList.add(RawModifier.SYNCHRONIZED)
    }
    if (JModifier.isTransient(modifiers)) {
        modifierList.add(RawModifier.TRANSIENT)
    }
    if (JModifier.isVolatile(modifiers)) {
        modifierList.add(RawModifier.VOLATILE)
    }
    return ModifierList(INVALID, annotations.map { it.toAnnotationReference() }, modifierList.map { Modifier(INVALID, it) })
}

fun Annotation.toAnnotationReference(): AnnotationReference {

}

fun <T: GenericDeclaration> TypeVariable<T>.asTypeParameter(): TypeParameter {
    return TypeParameter(INVALID, SimpleIdentifier(INVALID, name), bounds.toList())
}

fun JParameter.asMethodValueParameter(): MethodValueParameter {
    val name = SimpleIdentifier(INVALID, name)
    val type = parameterizedType
    return MethodValueParameter(INVALID, Parameter(INVALID, name, type))
}

fun <T> intersection(lists: List<List<T>>): Set<T> {
    return when (lists.size) {
        0 -> emptySet()
        1 -> lists.single().toSet()
        else -> lists[0].intersect(intersection(lists.drop(1)))
    }
}

fun <T> intersection(vararg lists: List<T>): Set<T> {
    return intersection(listOf(*lists))
}

infix fun Type.supers(other: Type): Boolean {
    return when (this) {
        is Class<*> -> when (other) {
            is Class<*> -> isAssignableFrom(other)
            is ParameterizedType -> isAssignableFrom(other.rawType as Class<*>)
            is TypeVariable<*> -> other.bounds.all { supers(it) }
            is GenericArrayType -> this.isArray && this.arrayType() supers other.genericComponentType
            is WildcardType -> other.upperBounds.all { supers(it) } && other.lowerBounds.isEmpty()
            else -> throw InternalError("Didn't expect $other to be ${other.javaClass.name}")
        }
        is ParameterizedType -> when (other) {
            is Class<*> -> rawType supers other
            is ParameterizedType -> rawType supers other.rawType
                    && actualTypeArguments.size == other.actualTypeArguments.size
                    && actualTypeArguments.zip(other.actualTypeArguments).all { (a, b) -> a supers b }
            is TypeVariable<*> -> other.bounds.all { supers(it) }
            is GenericArrayType -> false
            is WildcardType -> other.upperBounds.all { supers(it) } && other.lowerBounds.isEmpty()
            else -> throw InternalError("Didn't expect $other to be ${other.javaClass.name}")
        }
        is TypeVariable<*> -> false
        is GenericArrayType -> when (other) {
            is Class<*> -> other.isArray && genericComponentType supers other.arrayType()
            is ParameterizedType -> false
            is TypeVariable<*> -> false
            is GenericArrayType -> genericComponentType supers other.genericComponentType
            is WildcardType -> false
            else -> throw InternalError("Didn't expect $other to be ${other.javaClass.name}")
        }
        is WildcardType -> this.lowerBounds.all { it supers other } && this.upperBounds.isEmpty()
        else -> throw InternalError("Didn't expect $this to be ${javaClass.name}")
    }
}

infix fun Type.extends(other: Type) = other supers this
