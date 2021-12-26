package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class ByteLiteral(
    override val position: Position,
    override val value: Byte,
) : LiteralConstant<Byte>
