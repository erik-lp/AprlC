package aprl.compiler.conversion

enum class NamedType(val namingPattern: Regex) {
    
    CLASS(Regex("[A-Z][A-Za-z\\d]*")),
    INTERFACE(CLASS.namingPattern),
    STRUCT(CLASS.namingPattern),
    ANNOTATION(CLASS.namingPattern),
    DOCUMENT(CLASS.namingPattern),
    VARIABLE(Regex("[a-z][A-Za-z\\d]*")),
    CONSTANT(Regex("[A-Z][_A-Z\\d]*")),
    ENUM_ENTRY(Regex("[A-Z]([A-Za-z\\d]*|[A-Z_\\d]*)")),
    FUNCTION(VARIABLE.namingPattern),
    PARAMETER(VARIABLE.namingPattern);
    
    override fun toString(): String {
        return super.toString().replace("_", " ").lowercase().replaceFirstChar(Char::uppercaseChar)
    }
    
}
