package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class TypeParameterModifierList(
    override val position: Position,
    val annotations: List<AnnotationReference>,
    val modifier: TypeParameterModifier?,
) : Token
