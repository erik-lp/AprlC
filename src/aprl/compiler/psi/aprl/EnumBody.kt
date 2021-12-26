package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class EnumBody(
    override val position: Position,
    val entries: List<EnumEntry>,
    val members: List<ClassMember>?
) : Token
