package aprl.compiler.psi.java

import aprl.compiler.psi.Position
import java.lang.reflect.Type

class Parameter(
    override val position: Position,
    override val name: SimpleIdentifier,
    val type: Type
) : Named
