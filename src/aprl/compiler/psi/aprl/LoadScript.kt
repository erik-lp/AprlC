package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class LoadScript(
    override val position: Position,
    val block: Block
) : StructMember, ClassMember
