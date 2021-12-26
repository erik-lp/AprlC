package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class LambdaCallSuffix(
    override val position: Position,
    val valueArguments: List<ValueArgument>?,
    val annotatedLambda: AnnotatedLambda
) : Token
