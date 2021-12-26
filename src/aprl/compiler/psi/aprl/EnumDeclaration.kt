package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class EnumDeclaration(
    override val position: Position,
    override val modifiers: ModifierList,
    override val name: SimpleIdentifier,
    val primaryConstructor: PrimaryConstructor?,
    val body: EnumBody
) : TopLevelObject(), Named
