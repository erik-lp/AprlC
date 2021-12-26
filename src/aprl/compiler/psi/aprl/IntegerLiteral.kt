package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class IntegerLiteral(
    override val position: Position,
    override val value: Int
) : LiteralConstant<Int>
