package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class UnescapedAnnotation(
    override val position: Position,
    val identifier: Identifier,
    val arguments: List<ValueArgument>?
) : Token
