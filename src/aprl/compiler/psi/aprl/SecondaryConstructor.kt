package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class SecondaryConstructor(
    override val position: Position,
    val modifiers: ModifierList,
    val parameters: List<FunctionValueParameter>,
    val delegationCall: ConstructorDelegationCall?,
    val block: Block?
) : ClassMember
