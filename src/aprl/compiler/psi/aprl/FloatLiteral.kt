package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class FloatLiteral(
    override val position: Position,
    override val value: Float
) : LiteralConstant<Float>
