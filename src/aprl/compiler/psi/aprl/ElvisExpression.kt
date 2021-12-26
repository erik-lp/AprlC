package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class ElvisExpression(
    override val position: Position,
    val infixFunctionCalls: List<InfixFunctionCall>
) : Token
