package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class RangeExpression(
    override val position: Position,
    val from: XorExpression,
    val operator: Operator?,
    val to: XorExpression?
) : Token {
    
    enum class Operator {
        TO, // ..
        DOWNTO, // >..
        UNTIL // ..<
    }
    
}
