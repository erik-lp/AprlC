package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class AdditiveExpression(
    override val position: Position,
    val firstMultiplicativeExpression: MultiplicativeExpression,
    val multiplicativeExpressions: List<Pair<Operator, MultiplicativeExpression>>
) : Token {
    
    enum class Operator(val operatorName: String) {
        ADD("plus"),
        SUB("minus")
    }
    
}
