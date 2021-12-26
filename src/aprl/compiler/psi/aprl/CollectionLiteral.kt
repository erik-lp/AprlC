package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class CollectionLiteral(
    override val position: Position,
    val expressions: List<Expression>
) : Token
