package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class DoubleLiteral(
    override val position: Position,
    override val value: Double,
) : LiteralConstant<Double>
