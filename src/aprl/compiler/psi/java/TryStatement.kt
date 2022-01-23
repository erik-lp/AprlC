package aprl.compiler.psi.java

import aprl.compiler.psi.Position

class TryStatement(
    override val position: Position,
    val resources: List<TryResource>?,
    val block: Block,
    val catchClauses: List<CatchClause>,
    val finallyBlock: Block?,
) : Token
