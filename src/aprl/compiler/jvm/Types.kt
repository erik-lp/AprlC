package aprl.compiler.jvm

import aprl.lang.*
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
}

object Void : Type(mutableListOf()) {
    override val javaType: Class<Void> = Void.TYPE
    override val typeArguments: TypeArgument? = null
}

class FunctionType(annotations: Annotations, val types: List<Type>, val returnType: Type) : Type(annotations) {
    override val javaType: Class<*> get() = when (types.size) {
        0 -> Function0::class
        1 -> Function1::class
        2 -> Function2::class
        3 -> Function3::class
        4 -> Function4::class
        5 -> Function5::class
        6 -> Function6::class
        7 -> Function7::class
        8 -> Function8::class
        9 -> Function9::class
        10 -> Function10::class
        11 -> Function11::class
        12 -> Function12::class
        13 -> Function13::class
        14 -> Function14::class
        15 -> Function15::class
        16 -> Function16::class
        17 -> Function17::class
        18 -> Function18::class
        19 -> Function19::class
        20 -> Function20::class
        21 -> Function21::class
        22 -> Function22::class
        23 -> Function23::class
        24 -> Function24::class
        25 -> Function25::class
        else -> throw InternalError("Lambda literal with more than 25 parameters! This should have been detected and caught earlier!")
    }.java
    override val typeArguments: TypeArgument get() = TypeArgument(types.map { TypeProjection(type = it) } + TypeProjection(type = returnType))
}

class ArrayType(annotations: Annotations = Annotations(), val type: Type) : Type(annotations) {
    override val javaType: Class<*> get() = TODO("Not yet implemented")
    override val typeArguments: TypeArgument? = null
}

class NullableType(annotations: Annotations = Annotations(), val type: Type) : Type(annotations) {
    override val javaType: Class<*> get() = TODO("Not yet implemented")
    override val typeArguments: TypeArgument? = null
}

class ClassType(override val javaType: Class<*>, override val typeArguments: TypeArgument? = null) : Type(Annotations())

class ReceiverType(val parenthesizedType: Type? = null, val nullableType: NullableType? = null, val identifier: ClassType? = null) {
    val type: Type get() = parenthesizedType ?: nullableType ?: identifier ?: throw InternalError("Expected ReceiverType ($this) to have parenthesizedType, nullableType or identifier")
}

class TypeArgument(val typeProjections: List<TypeProjection>) {
    fun toJava(): Array<JType> {
        TODO()
    }
}

class TypeProjection(val annotations: Annotations = Annotations(), val modifiers: MutableSet<TypeProjectionModifier> = mutableSetOf(), val type: Type?) {
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
