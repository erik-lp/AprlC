package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class ElsifExpression(
    override val position: Position,
    val expression: Expression,
    val block: Block
) : Token
