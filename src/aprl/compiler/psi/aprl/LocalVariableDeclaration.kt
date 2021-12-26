package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class LocalVariableDeclaration(
    override val position: Position,
    val annotations: List<AnnotationReference>?,
    val static: Boolean,
    val final: Boolean,
    val variableDeclaration: VariableDeclaration,
    val expression: Expression?,
) : Token
