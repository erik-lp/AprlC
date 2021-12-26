package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class AnnotationDeclaration(
    override val position: Position,
    override val modifiers: ModifierList,
    override val name: SimpleIdentifier,
    val primaryConstructor: PrimaryConstructor?,
    val members: List<ClassMember>?,
) : TopLevelObject(), Named
