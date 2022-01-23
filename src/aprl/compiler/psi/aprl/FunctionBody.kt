package aprl.compiler.psi.aprl

import aprl.compiler.Scope
import aprl.compiler.psi.Position
import java.lang.reflect.Type
import aprl.compiler.psi.java.Block as JBlock

class FunctionBody(
    override val position: Position,
    val block: Block?,
    val expression: Expression?,
) : Token {
    
    fun toBlock(): JBlock {
        return block?.toJavaBlock() ?: expression!!.toBlock().toJavaBlock()
    }
    
    fun inferReturnType(scope: Scope<Named>): Type? {
        return block?.inferType() ?: expression!!.inferType(scope)
    }
    
}
