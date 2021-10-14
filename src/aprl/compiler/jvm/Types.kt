package aprl.compiler.jvm

abstract class Type(val annotations: Annotations)

class FunctionType(annotations: Annotations, val types: ArrayList<Type>, val returnType: Type) : Type(annotations)
class ArrayType(annotations: Annotations, val type: Type) : Type(annotations)
class NullableType(annotations: Annotations, val type: Type) : Type(annotations)
class UserType(annotations: Annotations, val identifier: Identifier) : Type(annotations)
