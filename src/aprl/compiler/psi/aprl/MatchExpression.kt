package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class MatchExpression(
    override val position: Position,
    val expression: Expression,
    val matchEntries: List<MatchEntry>
) : ConditionalExpression
