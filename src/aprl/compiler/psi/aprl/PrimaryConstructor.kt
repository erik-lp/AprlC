package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class PrimaryConstructor(
    override val position: Position,
    val modifiers: ModifierList?,
    val classParameters: List<ClassParameter>,
) : Token
