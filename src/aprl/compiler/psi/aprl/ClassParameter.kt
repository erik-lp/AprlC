package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class ClassParameter(
    override val position: Position,
    val modifiers: ModifierList,
    val final: Boolean?,
    override val name: SimpleIdentifier,
    val type: TypeReference,
    val expression: Expression?
) : Named
