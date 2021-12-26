package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class LongLiteral(
    override val position: Position,
    override val value: Long,
) : LiteralConstant<Long>
