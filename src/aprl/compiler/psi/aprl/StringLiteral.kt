package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class StringLiteral(
    override val position: Position,
    override val value: String,
) : LiteralConstant<String>
