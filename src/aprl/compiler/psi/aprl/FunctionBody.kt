package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class FunctionBody(
    override val position: Position,
    val block: Block?,
    val expression: Expression?,
) : Token
