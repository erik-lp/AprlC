package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class NamespaceHeader(
    override val position: Position,
    val identifier: Identifier
) : Token
