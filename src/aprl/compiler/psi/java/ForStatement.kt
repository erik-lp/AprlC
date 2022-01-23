package aprl.compiler.psi.java

import aprl.compiler.psi.Position

class ForStatement(
    override val position: Position,
    val forControl: ForControl,
    val block: Block
) : Token
