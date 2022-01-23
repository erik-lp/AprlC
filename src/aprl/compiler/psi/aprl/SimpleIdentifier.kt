package aprl.compiler.psi.aprl

import aprl.compiler.psi.INVALID
import aprl.compiler.psi.Position
import aprl.compiler.psi.java.SimpleIdentifier as JSimpleIdentifier

class SimpleIdentifier(
    override val position: Position,
    val identifier: String
) : Token {
    
    override fun equals(other: Any?): Boolean {
        return other is SimpleIdentifier && identifier == other.identifier
    }
    
    override fun toString() = identifier
    
    fun toJavaIdentifier() = JSimpleIdentifier(INVALID, identifier)
    
}
