package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class OptionalTryExpression(
    override val position: Position,
    val block: Block?,
    val expression: Expression?
) : Token
