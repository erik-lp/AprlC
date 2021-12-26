package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class ArrayType(
    override val position: Position,
    val type: TypeReference,
) : Token
