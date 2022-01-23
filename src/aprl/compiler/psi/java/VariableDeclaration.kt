package aprl.compiler.psi.java

import aprl.compiler.psi.Position
import java.lang.reflect.Type

class VariableDeclaration(
    override val position: Position,
    override val annotations: List<AnnotationReference>,
    override val name: SimpleIdentifier,
    val type: Type
) : Annotatable, Named
