package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class VariableDeclaration(
    override val position: Position,
    override val annotations: List<AnnotationReference>,
    override val name: SimpleIdentifier,
    val type: TypeReference?
) : Annotatable, Named
