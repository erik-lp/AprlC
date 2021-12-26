package aprl.compiler.psi.aprl

import aprl.compiler.contentEquals
import aprl.compiler.psi.Position

class MultiImport(
    override val position: Position,
    val identifier: Identifier,
    val subImports: List<SingleImport>,
) : Token {
    
    override fun equals(other: Any?): Boolean {
        return other is MultiImport
                && identifier == other.identifier
                && subImports.contentEquals(other.subImports)
    }
    
}
