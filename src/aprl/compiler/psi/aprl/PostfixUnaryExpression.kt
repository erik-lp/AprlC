package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class PostfixUnaryExpression(
    override val position: Position,
    val atomicExpression: AtomicExpression,
    val unaryPostfixes: List<UnaryPostfix>
) : Token
