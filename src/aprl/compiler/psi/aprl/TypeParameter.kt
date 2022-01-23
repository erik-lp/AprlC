package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position
import aprl.compiler.psi.java.TypeParameter

class TypeParameter(
    override val position: Position,
    val modifiers: TypeParameterModifierList,
    override val name: SimpleIdentifier,
    val bounds: List<TypeReference>?
) : Named {
    
    fun toJavaTypeParameter(): TypeParameter {
    
    }
    
}
