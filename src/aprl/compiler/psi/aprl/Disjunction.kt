package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class Disjunction(
    override val position: Position,
    val conjunctions: List<Conjunction>,
) : Token
