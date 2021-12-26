package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class ClassDeclaration(
    override val position: Position,
    override val modifiers: ModifierList,
    override val name: SimpleIdentifier,
    val typeParameters: List<TypeParameter>?,
    val primaryConstructor: PrimaryConstructor?,
    val delegationSpecifiers: List<DelegationSpecifier>,
    val members: List<ClassMember>?,
) : TopLevelObject(), Named
