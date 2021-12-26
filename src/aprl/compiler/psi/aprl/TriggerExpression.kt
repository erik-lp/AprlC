package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class TriggerExpression(
    override val position: Position,
    val expression: Expression
) : JumpExpression