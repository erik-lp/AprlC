package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class TypeProjection(
    override val position: Position,
    val wildcard: Boolean,
    val typeProjectionModifierList: TypeProjectionModifierList?,
    val type: TypeReference?
) : Token
