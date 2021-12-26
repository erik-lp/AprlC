package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class LambdaLiteral(
    override val position: Position,
    val parameters: List<LambdaParameter>,
    val statements: List<Statement>
) : Token
