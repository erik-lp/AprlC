package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class PartnerDeclaration(
    override val position: Position,
    val modifiers: ModifierList,
    val members: List<ClassMember>?
) : ClassMember
