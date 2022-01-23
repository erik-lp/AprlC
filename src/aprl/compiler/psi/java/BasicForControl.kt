package aprl.compiler.psi.java

import aprl.compiler.psi.Position

class BasicForControl(
    override val position: Position,
    val forInit: ForInitiator?,
    val condition: Expression?,
    val forUpdater: List<Expression>?
) : ForControl() {
    
    class ForInitiator(
        override val position: Position,
        val localVariableDeclaration: LocalVariableDeclaration?,
        val expressions: List<Expression>?
    ) : Token
    
}
