package aprl.compiler.psi.java

import aprl.compiler.psi.Position

class Statement(
    override val position: Position,
    val localVariableDeclaration: LocalVariableDeclaration?,
    val assertStatement: AssertStatement?,
    val ifStatement: IfStatement?,
    val forStatement: ForStatement?,
    val whileStatement: WhileStatement?,
    val doWhileStatement: DoWhileStatement,
    val tryStatement: TryStatement?,
    val switchStatement: SwitchStatement?,
    val synchronizedStatement: SynchronizedStatement?,
    val returnStatement: ReturnStatement?,
    val throwStatement: ThrowStatement?,
    val breakStatement: BreakStatement?,
    val continueStatement: ContinueStatement?,
    val expression: Expression?
) : Token
