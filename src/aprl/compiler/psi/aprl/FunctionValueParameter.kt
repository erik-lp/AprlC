package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class FunctionValueParameter(
    override val position: Position,
    val modifierList: ModifierList,
    val parameter: Parameter,
    val default: Expression?
) : Token
