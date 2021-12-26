package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class TypeParameter(
    override val position: Position,
    val modifiers: TypeParameterModifierList,
    override val name: SimpleIdentifier,
    val bounds: List<TypeReference>?
) : Named
