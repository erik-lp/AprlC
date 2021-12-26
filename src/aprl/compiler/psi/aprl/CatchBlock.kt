package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class CatchBlock(
    override val position: Position,
    val caughtException: CaughtException?,
    val block: Block?
) : Token
