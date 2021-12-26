package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class LambdaParameter(
    override val position: Position,
    val annotations: List<AnnotationReference>,
    override val name: SimpleIdentifier,
    val type: TypeReference?
) : Named
