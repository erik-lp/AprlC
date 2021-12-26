package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class FunctionType(
    override val position: Position,
    val types: List<TypeReference>,
    val returnType: TypeReference,
) : Token
