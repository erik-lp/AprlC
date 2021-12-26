package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class ImportHeader(
    override val position: Position,
    val importIdentifiers: List<ImportIdentifier>,
) : Token
