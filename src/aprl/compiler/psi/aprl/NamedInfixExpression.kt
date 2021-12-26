package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class NamedInfixExpression(
    override val position: Position,
    val elvisExpression: ElvisExpression,
    val namedInfixes: List<NamedInfix>
) : Token
