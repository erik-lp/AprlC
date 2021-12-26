package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class IfExpression(
    override val position: Position,
    val unless: Boolean,
    val condition: Expression,
    val block: Block,
    val elsifExpressions: List<ElsifExpression>,
    val elseExpression: Block?
) : ConditionalExpression