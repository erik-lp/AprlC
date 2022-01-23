package aprl.compiler.psi.aprl

import aprl.compiler.psi.INVALID
import aprl.compiler.psi.Position
import aprl.compiler.psi.java.MethodValueParameter

class FunctionValueParameter(
    override val position: Position,
    override val modifiers: ModifierList,
    val parameter: Parameter,
    val default: Expression?
) : Token, Modifiable, Named {
    
    override val name: SimpleIdentifier
        get() = parameter.name
    
    fun toMethodValueParameter(): MethodValueParameter {
        return MethodValueParameter(INVALID, parameter.toJavaParameter())
    }
    
}
