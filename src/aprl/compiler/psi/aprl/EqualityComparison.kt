package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class EqualityComparison(
    override val position: Position,
    val identityComparisons: List<IdentityComparison>
) : Token
