package aprl.compiler.psi.java

import aprl.compiler.psi.Position

class AssertStatement(
    override val position: Position,
    val condition: Expression,
    val errorMessage: Expression?
) : Token
