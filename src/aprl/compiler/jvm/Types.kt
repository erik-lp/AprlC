package aprl.compiler.jvm

import aprl.AprlParser
import aprl.compiler.AprlListener
import java.lang.Void
import java.lang.reflect.Type as JType

abstract class Type(val annotations: Annotations) : Java {
    abstract val javaType: Class<*>
    abstract val typeArguments: TypeArgument?
    
    final override fun toJava(): String {
        val sb = StringBuilder(javaType.name)
        if (typeArguments != null) {
            sb.append("<")
            sb.append(typeArguments!!.toJava())
            sb.append(">")
        }
        return sb.toString()
    }
    
    fun canonical() = javaType to typeArguments
}

object Void : Type(mutableListOf()) {
    override val typeArguments: TypeArgument? = null
    override val javaType: Class<Void> = Void.TYPE
}

class FunctionType(annotations: Annotations, val types: MutableList<Type>, val returnType: Type) : Type(annotations) {
    override val javaType: Class<*> get() = TODO("")
    override val typeArguments: TypeArgument? get() {
        // TODO: FunctionType.typeArguments
        return null
    }
}

class ArrayType(annotations: Annotations, val type: Type) : Type(annotations) {
    override val javaType: Class<*> get() = TODO("Not yet implemented")
    override val typeArguments: TypeArgument? = null
}

class NullableType(annotations: Annotations, val type: Type) : Type(annotations) {
    override val javaType: Class<*> get() = TODO("Not yet implemented")
    override val typeArguments: TypeArgument? = null
}

class Identifier(val parent: AprlListener, annotations: Annotations, val identifiers: MutableList<AprlParser.SimpleIdentifierContext>, override val typeArguments: TypeArgument?) : Type(annotations) {
    override val javaType: Class<*> get() = parent.loadImportedClass(identifiers)
}

class ClassType(override val javaType: Class<*>, override val typeArguments: TypeArgument?) : Type(mutableListOf())

class ReceiverType(val parenthesizedType: Type? = null, val nullableType: NullableType? = null, val identifier: Identifier? = null) {
    val type: Type get() = parenthesizedType ?: nullableType ?: identifier ?: throw InternalError("Expected ReceiverType ($this) to have parenthesizedType, nullableType or identifier")
}

class TypeArgument(val typeProjections: MutableList<TypeProjection>) {
    fun toJava(): Array<JType> {
        TODO()
    }
}

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
