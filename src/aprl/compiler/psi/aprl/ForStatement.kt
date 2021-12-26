package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class ForStatement(
    override val position: Position,
    val iteratorAnnotations: List<AnnotationReference>,
    val iterator: VariableDeclaration,
    val expression: Expression,
    val block: Block,
) : LoopStatement
