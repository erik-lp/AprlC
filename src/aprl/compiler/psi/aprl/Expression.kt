package aprl.compiler.psi.aprl

import aprl.compiler.Scope
import aprl.compiler.psi.INVALID
import aprl.compiler.psi.Position
import java.lang.reflect.Type

class Expression(
    override val position: Position,
    val disjunction: Disjunction,
) : Token {
    
    fun toBlock(): Block {
        val returnExpression = ReturnExpression(INVALID, this)
        return returnExpression.toBlock()
    }
    
    fun inferType(scope: Scope<Named>): Type? {
        return disjunction.inferType(scope)
    }
    
}
