package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class Setter(
    override val position: Position,
    val modifiers: ModifierList,
    val parameter: FunctionValueParameterWithOptionalType?,
    val returnType: TypeReference?,
    val body: FunctionBody?,
) : Token
