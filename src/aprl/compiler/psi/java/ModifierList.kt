package aprl.compiler.psi.java

import aprl.compiler.psi.INVALID
import aprl.compiler.psi.Position

class ModifierList(
    override val position: Position,
    val annotations: List<AnnotationReference>,
    val modifiers: List<Modifier>
) : Token {
    
    companion object {
        fun publicFinal(position: Position = INVALID) = ModifierList(position, emptyList(), listOf(Modifier.public(), Modifier.final()))
        fun publicStatic(position: Position = INVALID) = ModifierList(position, emptyList(), listOf(Modifier.public(), Modifier.static()))
        fun publicStaticFinal(position: Position = INVALID) = ModifierList(position, emptyList(), listOf(Modifier.public(), Modifier.static(), Modifier.final()))
    }
    
}
