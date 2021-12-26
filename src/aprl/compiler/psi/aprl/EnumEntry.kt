package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class EnumEntry(
    override val position: Position,
    val modifiers: ModifierList,
    override val name: SimpleIdentifier,
    val valueArguments: List<ValueArgument>?,
    val body: List<ClassMember>?
) : Named
