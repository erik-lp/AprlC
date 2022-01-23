package aprl.compiler.psi.java

import aprl.compiler.psi.Position

class SwitchStatement(
    override val position: Position,
    val expression: Expression,
    
) : Token
