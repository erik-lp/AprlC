package aprl.compiler.psi.java

import aprl.compiler.psi.Position

class IfStatement(
    override val position: Position,
    val condition: Expression,
    val block: Block,
    val elseBlock: Block
) : Token
