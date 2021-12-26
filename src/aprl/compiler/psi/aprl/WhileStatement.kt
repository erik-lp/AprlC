package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class WhileStatement(
    override val position: Position,
    val condition: Expression,
    val block: Block,
) : LoopStatement
