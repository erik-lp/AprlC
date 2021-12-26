package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class InfixFunctionCall(
    override val position: Position,
    val firstRangeExpression: RangeExpression,
    val rangeExpressions: List<Pair<SimpleIdentifier, RangeExpression>>
) : Token
