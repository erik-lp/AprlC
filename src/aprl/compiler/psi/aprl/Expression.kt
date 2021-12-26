package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class Expression(
    override val position: Position,
    val disjunction: Disjunction,
) : Token
