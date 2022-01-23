package aprl.compiler.psi.java

import aprl.compiler.psi.Position

class DoWhileStatement(
    override val position: Position,
    val block: Block,
    val condition: Expression
) : Token
