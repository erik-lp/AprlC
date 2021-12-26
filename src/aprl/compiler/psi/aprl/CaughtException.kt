package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class CaughtException(
    override val position: Position,
    val annotations: List<AnnotationReference>,
    override val name: SimpleIdentifier,
    val types: List<TypeReference>
) : Named
