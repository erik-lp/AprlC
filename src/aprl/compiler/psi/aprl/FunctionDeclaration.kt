package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class FunctionDeclaration(
    override val position: Position,
    override val modifiers: ModifierList,
    val static: Boolean,
    val operator: Boolean,
    val typeParameters: List<TypeParameter>,
    override val name: SimpleIdentifier,
    val parameters: List<FunctionValueParameter>,
    val returnType: TypeReference?,
    val body: FunctionBody?,
) : TopLevelObject(), Named
