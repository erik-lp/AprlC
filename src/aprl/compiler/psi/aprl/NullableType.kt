package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class NullableType(
    override val position: Position,
    val identifier: Pair<Identifier, List<TypeProjection>?>?,
    val parenthesizedType: TypeReference?,
    val arrayType: ArrayType?,
) : Token
