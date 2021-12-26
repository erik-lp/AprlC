package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class ConstructorDelegationCall(
    override val position: Position,
    val isSuper: Boolean,
    val valueArguments: List<ValueArgument>
) : Token
