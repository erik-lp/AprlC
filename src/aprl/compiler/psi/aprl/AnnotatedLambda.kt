package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class AnnotatedLambda(
    override val position: Position,
    val annotations: List<AnnotationReference>,
    val lambdaLiteral: LambdaLiteral
) : Token
