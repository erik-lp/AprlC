package aprl.compiler.psi.java

import aprl.compiler.psi.Position

class LocalVariableDeclaration(
    override val position: Position,
    val annotations: List<AnnotationReference>?,
    val final: Boolean,
    val variableDeclaration: VariableDeclaration,
    val expression: Expression?
) : Named {
    
    override val name: SimpleIdentifier
        get() = variableDeclaration.name
    
}