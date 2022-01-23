package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class ReturnExpression(
    override val position: Position,
    val expression: Expression?
) : JumpExpression {
    
    fun toBlock(): Block {
    
    }
    
}
