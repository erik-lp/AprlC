package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class CallSuffix(
    override val position: Position,
    val typeArguments: List<TypeProjection>?,
    val lambdaCallSuffix: LambdaCallSuffix?,
    val valueArguments: List<ValueArgument>?
) : Token
