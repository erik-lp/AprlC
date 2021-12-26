package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class ShortLiteral(
    override val position: Position,
    override val value: Short,
) : LiteralConstant<Short>
