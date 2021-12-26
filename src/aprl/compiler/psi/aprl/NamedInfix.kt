package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class NamedInfix(
    override val position: Position,
    val inExpression: Pair<Boolean, ElvisExpression>?,
    val isExpression: Pair<Boolean, TypeReference>?,
) : Token
