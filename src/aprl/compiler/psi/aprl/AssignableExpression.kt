package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class AssignableExpression(
    override val position: Position,
    val expression: Expression,
    val assignableSuffixes: List<AssignableSuffix>
) : Token
