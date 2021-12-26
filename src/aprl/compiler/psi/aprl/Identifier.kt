package aprl.compiler.psi.aprl

import aprl.compiler.contentEquals
import aprl.compiler.psi.Position

class Identifier(
    override val position: Position,
    val identifiers: List<SimpleIdentifier>
) : Token {
    
    fun last() = identifiers.last()
    
    override fun equals(other: Any?): Boolean {
        return other is Identifier && identifiers.contentEquals(other.identifiers)
    }
    
}
