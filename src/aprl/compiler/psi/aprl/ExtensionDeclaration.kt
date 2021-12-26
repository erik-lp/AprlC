package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class ExtensionDeclaration(
    override val position: Position,
    override val modifiers: ModifierList,
    val typeParameters: List<TypeParameter>?,
    val receiverType: ReceiverType,
    val extensionBody: List<ExtensionMember>?
) : TopLevelObject()
