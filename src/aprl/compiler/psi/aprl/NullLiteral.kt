package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class NullLiteral(
    override val position: Position,
) : LiteralConstant<Nothing?> {
    
    override val value = null
    
}
