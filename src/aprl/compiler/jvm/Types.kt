package aprl.compiler.jvm

abstract class Type(val annotations: Annotations)

class FunctionType(annotations: Annotations, val types: MutableList<Type>, val returnType: Type) : Type(annotations)
class ArrayType(annotations: Annotations, val type: Type) : Type(annotations)
class NullableType(annotations: Annotations, val type: Type) : Type(annotations)
class Identifier(annotations: Annotations, val identifiers: MutableList<String>) : Type(annotations)

class ReceiverType {
    var annotations: Annotations? = null
    var parenthesizedType: Type? = null
    var nullableType: NullableType? = null
    var identifier: Identifier? = null
}

class TypeArgument(val typeProjections: MutableList<TypeProjection>)

class TypeProjection(val annotations: Annotations, val modifiers: MutableList<TypeProjectionModifier>, val type: Type?) {
    val wildcard = type == null
}

enum class TypeProjectionModifier {
    SUB,
    SUPER
}

enum class TypeParameterModifier {
    ACTUAL,
    SUB,
    SUPER
}
