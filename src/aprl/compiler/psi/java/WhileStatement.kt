package aprl.compiler.psi.java

import aprl.compiler.psi.Position

class WhileStatement(
    override val position: Position,
    val condition: Expression,
    val block: Block
) : Token
