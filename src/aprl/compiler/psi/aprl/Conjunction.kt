package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class Conjunction(
    override val position: Position,
    val equalityComparisons: List<EqualityComparison>
) : Token
