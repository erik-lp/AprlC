package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class NavigationSuffix(
    override val position: Position,
    val operator: Operator,
    val identifier: SimpleIdentifier,
) : AssignableSuffix {
    
    enum class Operator {
        PERIOD,
        QUEST_PERIOD,
        DOUBLE_COLON
    }
    
}
