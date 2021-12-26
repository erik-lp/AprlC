package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class Comparison(
    override val position: Position,
    val firstNamedInfix: NamedInfixExpression,
    val namedInfixes: List<Pair<Operator, NamedInfixExpression>>
) : Token {
    
    enum class Operator {
        LANGLE, NGEQ,
        RANGLE, NLEQ,
        LEQ, NRANGLE,
        GEQ, NLANGLE
    }
    
}
