package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class Parameter(
    override val position: Position,
    override val name: SimpleIdentifier,
    val type: TypeReference,
) : Named
