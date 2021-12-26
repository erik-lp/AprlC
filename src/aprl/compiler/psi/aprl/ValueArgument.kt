package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class ValueArgument(
    override val position: Position,
    val annotations: List<AnnotationReference>,
    val expression: Expression,
) : Token
