package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class Assignment(
    override val position: Position,
    val assignableExpression: AssignableExpression,
    val operator: Operator,
    val expression: Expression,
) : Token {
    
    enum class Operator {
        ASSIGN,
        DEFINE,
        ADD_ASSIGN,
        SUB_ASSIGN,
        MUL_ASSIGN,
        DIV_ASSIGN,
        MOD_ASSIGN,
        EXP_ASSIGN,
        CONJ_ASSIGN,
        DISJ_ASSIGN,
        XOR_ASSIGN,
        ELVIS_ASSIGN
    }
    
}
