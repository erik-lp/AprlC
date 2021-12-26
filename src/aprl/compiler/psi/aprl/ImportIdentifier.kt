package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class ImportIdentifier(
    override val position: Position,
    val singleImport: SingleImport?,
    val allImport: AllImport?,
    val multiImport: MultiImport?,
) : Token {
    
    override fun equals(other: Any?): Boolean {
        return other is ImportIdentifier
                && singleImport == other.singleImport
                && allImport == other.allImport
                && multiImport == other.multiImport
    }
    
}
