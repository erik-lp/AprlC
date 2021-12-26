package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class IdentityComparison(
    override val position: Position,
    val comparisons: List<Comparison>
) : Token
