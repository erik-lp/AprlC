package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class ExtensionMember(
    override val position: Position,
    val functionDeclaration: FunctionDeclaration
) : Token
