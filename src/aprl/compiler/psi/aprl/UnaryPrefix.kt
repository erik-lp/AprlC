package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class UnaryPrefix(
    override val position: Position,
    val unaryPrefix: RawUnaryPrefix
) : Token {
    
    enum class RawUnaryPrefix {
        INCR,
        DECR,
        ADD,
        SUB,
        EXCL,
        DOUBLE_AT
    }
    
}