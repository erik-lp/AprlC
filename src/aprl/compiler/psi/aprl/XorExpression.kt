package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class XorExpression(
    override val position: Position,
    val additiveExpressions: List<AdditiveExpression>
) : Token
