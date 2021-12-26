package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class CallableReference(
    override val position: Position,
    val receiverType: ReceiverType,
    val reference: SimpleIdentifier
) : Token
