package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class UnaryPostfix(
    override val position: Position,
    val postfixUnaryOperator: PostfixUnaryOperator?,
    val typeArguments: List<TypeProjection>?,
    val callSuffix: CallSuffix?,
    val indexingSuffix: IndexingSuffix?,
    val navigationSuffix: NavigationSuffix?
) : Token {
    
    enum class PostfixUnaryOperator {
        INCR,
        DECR,
        DOUBLE_EXCL
    }
    
}
