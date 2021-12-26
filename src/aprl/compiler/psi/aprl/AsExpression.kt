package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class AsExpression(
    override val position: Position,
    val prefixUnaryExpression: PrefixUnaryExpression,
    val operator: Operator?,
    val type: TypeReference?
) : Token {
    
    enum class Operator {
        AS,
        AS_QUEST
    }
    
}
