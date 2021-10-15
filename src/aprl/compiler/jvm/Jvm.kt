package aprl.compiler.jvm

sealed interface ClassMember
sealed interface StructMember // TODO: StructMember
sealed interface TopLevelObject : ClassMember

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

class Clazz(val name: String) : TopLevelObject {
    
    val annotations = Annotations()
    val modifiers = ArrayList<Modifier>()
    val typeParameters = TypeParameters()
    
    val superClasses = ArrayList<Type>()
    
    val classMembers = ArrayList<ClassMember>()
    
}

class Struct(val name: String) : TopLevelObject {
    
    val annotations = Annotations()
    val modifiers = ArrayList<Modifier>()
    
    val superClasses = ArrayList<Type>()
    
    val structMembers = ArrayList<StructMember>()
    
}

class Constructor(val clazz: Clazz) : TopLevelObject {
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

class Interface(val name: String) : TopLevelObject {

}

class Annotation(val name: String) : TopLevelObject {

}

class Enum(val name: String) : TopLevelObject {

}

class Document(val name: String) : TopLevelObject {

}

class Function(val name: String, val returnType: Type) : TopLevelObject {
    val annotations = Annotations()
    val modifiers = ArrayList<Modifier>()
    val parameters = ArrayList<MethodParameter>()
    val statements = Statements()
}

data class MethodParameter(val name: String, val type: Type)

class Property(val name: String, val type: Type, val initialValue: Expression? = null, val static: Boolean = false) : TopLevelObject {
    val annotations = Annotations()
    val modifiers = ArrayList<Modifier>()
}

class LoadScript : ClassMember {
    val statements = Statements()
}

@Suppress("ArrayInDataClass")
data class TypeParameter(val name: String, val constraints: Array<Type>)
