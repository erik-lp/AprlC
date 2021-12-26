package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class Getter(
    override val position: Position,
    val modifiers: ModifierList,
    val returnType: TypeReference?,
    val body: FunctionBody?,
) : Token
