package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class TypeProjectionModifierList(
    override val position: Position,
    val annotations: List<AnnotationReference>,
    val typeProjectionModifier: TypeProjectionModifier?
) : Token
