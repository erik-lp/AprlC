package aprl.compiler.psi.java

import aprl.compiler.psi.Position
import java.lang.reflect.Type

class TypeParameter(
    override val position: Position,
    override val name: SimpleIdentifier,
    val bounds: List<Type>?
) : Named
