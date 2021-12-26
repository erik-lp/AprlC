package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class BoolLiteral(
    override val position: Position,
    override val value: Boolean
) : LiteralConstant<Boolean>
