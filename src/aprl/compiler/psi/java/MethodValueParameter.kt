package aprl.compiler.psi.java

import aprl.compiler.psi.Position

class MethodValueParameter(
    override val position: Position,
    val parameter: Parameter,
) : Token, Named {
    
    override val name: SimpleIdentifier
        get() = parameter.name
    
}
