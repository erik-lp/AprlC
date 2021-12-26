package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class MultiplicativeExpression(
    override val position: Position,
    val firstExponentialExpression: ExponentialExpression,
    val exponentialExpressions: List<Pair<Operator, ExponentialExpression>>
) : Token {
    
    enum class Operator {
        MUL,
        DIV,
        MOD
    }
    
    companion object {
    
    
    
    }
    
}
