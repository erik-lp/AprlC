package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class SingleImport(
    override val position: Position,
    val identifier: Identifier,
    val alias: SimpleIdentifier?,
) : Named {
    
    override val name: SimpleIdentifier
        get() = alias ?: identifier.last()
    
    fun frontend() = alias ?: identifier.identifiers.last()
    
    override fun equals(other: Any?): Boolean {
        return other is SingleImport
                && identifier == other.identifier
                && alias == other.alias
    }
    
}
