package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class IndexingSuffix(
    override val position: Position,
    val expressions: List<Expression>
) : AssignableSuffix
