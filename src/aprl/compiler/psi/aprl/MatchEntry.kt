package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class MatchEntry(
    override val position: Position,
    val constants: List<LiteralConstant<*>>?,
    val block: Block
) : Token
