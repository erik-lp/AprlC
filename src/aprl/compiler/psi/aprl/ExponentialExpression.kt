package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class ExponentialExpression(
    override val position: Position,
    val asExpressions: List<AsExpression>
) : Token
