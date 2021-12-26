package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class PrefixUnaryExpression(
    override val position: Position,
    val unaryPrefixes: List<UnaryPrefix>,
    val postfixUnaryExpression: PostfixUnaryExpression
) : Token
