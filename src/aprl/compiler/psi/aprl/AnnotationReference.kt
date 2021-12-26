package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class AnnotationReference(
    override val position: Position,
    val unescapedAnnotations: List<UnescapedAnnotation>
) : Token
