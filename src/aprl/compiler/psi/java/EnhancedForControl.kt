package aprl.compiler.psi.java

import aprl.compiler.psi.Position
import java.lang.reflect.Type

class EnhancedForControl(
    override val position: Position,
    val type: Type,
    val iterator: SimpleIdentifier,
    val iterable: Expression
) : ForControl()
