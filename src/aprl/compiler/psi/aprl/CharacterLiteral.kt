package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class CharacterLiteral(
    override val position: Position,
    override val value: Char
) : LiteralConstant<Char>
