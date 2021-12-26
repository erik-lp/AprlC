package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class DelegationSpecifier(
    override val position: Position,
    val identifier: Identifier,
    val typeArguments: List<TypeProjection>?,
    val valueArguments: List<ValueArgument>?,
) : Token
