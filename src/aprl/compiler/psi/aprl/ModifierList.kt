package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class ModifierList(
    override val position: Position,
    val annotations: List<AnnotationReference>,
    val modifiers: List<Modifier>,
) : Token
