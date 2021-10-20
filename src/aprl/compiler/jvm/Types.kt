package aprl.compiler.jvm

import aprl.AprlParser
import aprl.compiler.AprlListener

abstract class Type(val parent: AprlListener, val annotations: Annotations) {
    abstract fun toJava(): Class<*>
}

class FunctionType(parent: AprlListener, annotations: Annotations, val types: MutableList<Type>, val returnType: Type) : Type(parent, annotations) {
    override fun toJava(): Class<*> {
        TODO("Not yet implemented")
    }
}

class ArrayType(parent: AprlListener, annotations: Annotations, val type: Type) : Type(parent, annotations) {
    override fun toJava(): Class<*> {
        TODO("Not yet implemented")
    }
}

class NullableType(parent: AprlListener, annotations: Annotations, val type: Type) : Type(parent, annotations) {
    override fun toJava(): Class<*> {
        TODO("Not yet implemented")
    }
}

class Identifier(parent: AprlListener, annotations: Annotations, val identifiers: MutableList<AprlParser.SimpleIdentifierContext>, val typeArguments: TypeArgument?) : Type(parent, annotations) {
    override fun toJava(): Class<*> {
        return parent.loadImportedClass(identifiers)
    }
}

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
