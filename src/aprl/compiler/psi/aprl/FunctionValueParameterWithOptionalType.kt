package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class FunctionValueParameterWithOptionalType(
    override val position: Position,
    val modifiers: ModifierList,
    val parameter: ParameterWithOptionalType,
) : Token
