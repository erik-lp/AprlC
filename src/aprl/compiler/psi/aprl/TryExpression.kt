package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class TryExpression(
    override val position: Position,
    val block: Block,
    val catchBlocks: List<CatchBlock>,
    val finallyBlock: Block?
) : Token
