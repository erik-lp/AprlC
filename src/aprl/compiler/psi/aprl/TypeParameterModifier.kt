package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class TypeParameterModifier(
    override val position: Position,
    val modifier: RawTypeParameterModifier,
) : Token {
    
    enum class RawTypeParameterModifier {
        ACTUAL,
        SUB,
        SUPER
    }
    
}