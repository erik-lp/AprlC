package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class Block(
    override val position: Position,
    val statements: List<Statement>,
) : Token
