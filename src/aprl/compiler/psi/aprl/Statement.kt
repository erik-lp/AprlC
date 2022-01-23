package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position
import aprl.compiler.psi.java.Statement as JStatement

class Statement(
    override val position: Position,
    val localVariableDeclaration: LocalVariableDeclaration?,
    val assignment: Assignment?,
    val loopStatement: LoopStatement?,
    val expression: Expression?,
) : Token {
    
    fun toJavaStatement(): JStatement {
    
    }
    
}
