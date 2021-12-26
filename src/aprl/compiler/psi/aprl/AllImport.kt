package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class AllImport(
    override val position: Position,
    val identifier: Identifier,
) : Token {
    
    override fun equals(other: Any?): Boolean {
        return other is AllImport && other.identifier == identifier
    }
    
}
