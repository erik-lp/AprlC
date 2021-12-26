package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class Preamble(
    override val position: Position,
    val namespace: NamespaceHeader,
    val importList: List<ImportHeader>,
) : Token
