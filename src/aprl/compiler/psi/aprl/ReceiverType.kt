package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class ReceiverType(
    override val position: Position,
    val parenthesizedType: TypeReference?,
    val nullableType: NullableType?,
    val identifier: Identifier?
) : Token
