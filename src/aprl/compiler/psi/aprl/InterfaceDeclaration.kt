package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class InterfaceDeclaration(
    override val position: Position,
    override val modifiers: ModifierList,
    override val name: SimpleIdentifier,
    val typeParameters: List<TypeParameter>?,
    val delegationSpecifiers: List<Identifier>,
    val members: List<ClassMember>?
) : TopLevelObject(), Named