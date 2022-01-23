package aprl.compiler.psi.java

import aprl.compiler.psi.Position
import java.lang.reflect.Type

class CatchClause(
    override val position: Position,
    val types: List<Type>,
    val name: SimpleIdentifier,
    val block: Block
) : Token
