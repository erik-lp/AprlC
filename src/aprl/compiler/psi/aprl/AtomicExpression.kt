package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class AtomicExpression(
    override val position: Position,
    val identifier: Identifier?,
    val literalConstant: LiteralConstant<*>?,
    val contextualReference: Identifier?,
    val callableReference: CallableReference?,
    val lambdaLiteral: LambdaLiteral?,
    val collectionLiteral: CollectionLiteral?,
    val thisExpression: ThisExpression?,
    val superExpression: SuperExpression?,
    val conditionalExpression: ConditionalExpression?,
    val optionalTryExpression: OptionalTryExpression?,
    val tryExpression: TryExpression?,
    val jumpExpression: JumpExpression?,
) : Token
