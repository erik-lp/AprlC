package aprl.compiler.psi.java

import aprl.compiler.psi.Position
import aprl.compiler.psi.INVALID

class Block(
    override val position: Position,
    val statements: List<Statement>
) : Token {
    
    companion object {
        fun empty(position: Position = INVALID) = Block(position, emptyList())
    }
    
}
