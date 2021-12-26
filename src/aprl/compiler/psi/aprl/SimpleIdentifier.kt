package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class SimpleIdentifier(
    override val position: Position,
    val identifier: String
) : Token {
    
    override fun equals(other: Any?): Boolean {
        return other is SimpleIdentifier && identifier == other.identifier
    }
    
}
