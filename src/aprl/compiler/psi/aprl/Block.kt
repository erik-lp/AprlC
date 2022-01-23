package aprl.compiler.psi.aprl

import aprl.compiler.psi.INVALID
import aprl.compiler.psi.Position
import java.lang.reflect.Type
import aprl.compiler.psi.java.Block as JBlock

class Block(
    override val position: Position,
    val statements: List<Statement>,
) : Token {
    
    fun toJavaBlock(): JBlock {
        return JBlock(INVALID, statements.map { it.toJavaStatement() })
    }
    
    fun inferType(): Type? {
        // TODO: infer type from last statement BUT check terminating (return/lone) statements before that
    }
    
}
