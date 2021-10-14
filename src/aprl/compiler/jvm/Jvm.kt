package aprl.compiler.jvm

private sealed interface JvmToken {
    // fun toByteCode(): ByteArray
    fun toJava(): String
}

enum class Modifier {
    
    PUBLIC,
    LOCAL,
    BOUNDED,
    PRIVATE,
    SAMPLE,
    FINAL,
    OPEN,
    COVER,
    PARAMS,
    DIRECT,
    SYNC,
    EXTERNAL;
    
    fun `class`() = this in PUBLIC..OPEN
    
    fun function() = this in PUBLIC..COVER || this in DIRECT..EXTERNAL
    
    fun property() = this in PUBLIC..COVER
    
    fun parameter() = this == PARAMS
    
}

class Clazz(val name: String): JvmToken, ClassMember {
    
    val annotations = Annotations()
    val modifiers = ArrayList<Modifier>()
    
    val typeParameters = TypeParameters()
    
    val superClasses = ArrayList<Type>()
    
    val classMembers = ArrayList<ClassMember>()
    
    override fun toJava(): String {
        val sb = StringBuilder()
        
        return sb.toString()
    }
    
}

interface ClassMember

class Constructor(val clazz: Clazz) : ClassMember {
    val annotations = Annotations()
    val modifiers = ArrayList<Modifier>()
    val thisParameters: ValueArguments? = null
    val superParameters: ValueArguments? = null
    val statements = Statements()
}

class Identifier {
    
    private val identifiers = ArrayList<String>()
    
    fun add(identifier: String) {
        identifiers.add(identifier)
    }
    
    fun add(vararg identifiers: String) {
        this.identifiers.addAll(identifiers)
    }
    
}

class Statement {

}

class ValueArgument(val value: Expression) {
    val annotations = Annotations()
}

class Expression

class Interface(val name: String) : ClassMember {

}

class Annotation(val name: String) : ClassMember {

}

class Enum(val name: String) : ClassMember {

}

class Document(val name: String) : ClassMember {

}

class Method(val name: String, val returnType: Type) : ClassMember {
    val annotations = Annotations()
    val modifiers = ArrayList<Modifier>()
    val parameters = ArrayList<MethodParameter>()
    val statements = Statements()
}

data class MethodParameter(val name: String, val type: Type)

class Field(val name: String, val type: Type, val initialValue: Expression? = null, val static: Boolean = false) : ClassMember {
    val annotations = Annotations()
    val modifiers = ArrayList<Modifier>()
}

class LoadScript : ClassMember {
    val statements = Statements()
}

@Suppress("ArrayInDataClass")
data class TypeParameter(val name: String, val constraints: Array<Type>)
