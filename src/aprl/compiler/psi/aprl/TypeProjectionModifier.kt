package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class TypeProjectionModifier(
    override val position: Position,
    val modifier: RawTypeProjectionModifier
) : Token {
    
    enum class RawTypeProjectionModifier {
        SUB,
        SUPER
    }
    
}
