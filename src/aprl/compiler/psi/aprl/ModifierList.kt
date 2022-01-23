package aprl.compiler.psi.aprl

import aprl.compiler.psi.INVALID
import aprl.compiler.psi.Position
import aprl.compiler.psi.java.ModifierList as JModifierList

class ModifierList(
    override val position: Position,
    val annotations: List<AnnotationReference>,
    val modifiers: List<Modifier>,
) : Token {
    
    fun toJavaModifierList(): JModifierList {
        val javaAnnotations = annotations.map { it.toJavaAnnotationReference() }
        val javaModifiers = modifiers.map { it.toJavaModifier() }
        return JModifierList(INVALID, javaAnnotations, javaModifiers)
    }
    
}
