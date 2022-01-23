package aprl.compiler.psi.java

import aprl.compiler.psi.Position

class TryResource(
    override val position: Position,
    val variable: VariableDeclaration
) : Token
