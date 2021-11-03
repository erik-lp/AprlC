package aprl.compiler.jvm

import aprl.lang.Complex
import aprl.lang.Trilean

interface ClassMember {
    val enclosingClass: ClassMemberOwner?
}

interface StructMember // TODO: StructMember

interface TopLevelObject : ClassMember
interface OnlyClassMember : ClassMember

interface Annotatable {
    val annotations: Annotations
}

interface Modifiable : Annotatable {
    override val annotations: Annotations
    val modifiers: MutableSet<Modifier>
}

interface Java {
    fun toJava(): String
}

class Constructor(
    override val enclosingClass: ClassMemberOwner,
    val annotations: Annotations = Annotations(),
    val modifiers: MutableSet<Modifier> = mutableSetOf(),
    val parameters: MutableList<JavaParameter> = mutableListOf(),
    val statements: Statements = mutableListOf(),
) : Java, ClassMember {
    
    override fun toJava(): String {
        val sb = StringBuilder()
        with(annotations) { sb.append(toJava() + if (isNotEmpty()) "\n" else "") }
        sb.append(modifiers.joinToString("") { it.toJava() })
        sb.append(enclosingClass.name)
        sb.append("(" + parameters.joinToString(", ") { it.toJava() } + ") {")
        sb.append(statements.joinToString { it.toJava().prependIndent() + "\n" })
        sb.append("}")
        return sb.toString()
    }
    
}

class JavaParameter : Java {
    override fun toJava(): String {
        TODO("Not yet implemented")
    }
}

enum class Modifier(private val java: String?) : Java {
    
    PUBLIC("public "),
    LOCAL(""),
    BOUNDED("protected "),
    PRIVATE("private "),
    ABSTRACT("abstract "),
    FINAL("final "),
    OPEN(null),
    COVER(null),
    PARAMS(null),
    INLINE(null),
    SYNC("synchronized "),
    EXTERNAL("native ");
    
    fun `class`() = this in PUBLIC..OPEN
    fun enum() = visibility()
    fun function() = this in PUBLIC..COVER || this in INLINE..EXTERNAL
    fun property() = this in PUBLIC..COVER
    fun parameter() = this == PARAMS
    fun visibility() = this in PUBLIC..PRIVATE
    fun getterSetter() = visibility() || this == INLINE
    
    override fun toJava(): String = java ?: throw InternalError("$this does not have a java equivalent")
    
}

enum class Visibility {
    PUBLIC,
    LOCAL,
    BOUNDED,
    PRIVATE
}

abstract class ClassMemberOwner(val static: Boolean) : TopLevelObject, Modifiable {
    abstract val name: String
    val superClass: Class<*> = this.javaClass // TODO: ClassMemberOwner.superClass
}

class Clazz(
    override val name: String,
    override val enclosingClass: ClassMemberOwner?,
    override val annotations: Annotations = Annotations(),
    override val modifiers: MutableSet<Modifier> = mutableSetOf(),
    val typeParameters: MutableList<TypeParameter> = mutableListOf(),
    val superClasses: MutableList<Type> = mutableListOf(),
    val classMembers: MutableList<ClassMember> = mutableListOf(),
) : ClassMemberOwner(false) {

}

class Struct(
    override val name: String,
    override val enclosingClass: ClassMemberOwner?,
    override val annotations: Annotations = Annotations(),
    override val modifiers: MutableSet<Modifier> = mutableSetOf(),
    val superClasses: MutableList<Type> = mutableListOf(),
    val structMembers: MutableList<StructMember> = mutableListOf(),
) : ClassMemberOwner(true)

class Interface(
    override val name: String,
    override val enclosingClass: ClassMemberOwner?,
    override val annotations: Annotations = Annotations(),
    override val modifiers: MutableSet<Modifier> = mutableSetOf(),
    val typeParameters: MutableList<TypeParameter> = mutableListOf(),
    val superInterfaces: MutableList<Type> = mutableListOf(),
    val interfaceMembers: MutableList<ClassMember> = mutableListOf(),
) : ClassMemberOwner(false)

class Annotation(
    override val name: String,
    override val enclosingClass: ClassMemberOwner?,
    override val annotations: Annotations = Annotations(),
    override val modifiers: MutableSet<Modifier> = mutableSetOf(),
) : ClassMemberOwner(false)

class Enum(
    val name: String,
    override val enclosingClass: ClassMemberOwner?,
    override val annotations: Annotations = Annotations(),
    override val modifiers: MutableSet<Modifier> = mutableSetOf(),
) : TopLevelObject, Modifiable

class Document(
    override val name: String,
    override val enclosingClass: ClassMemberOwner?,
    override val annotations: Annotations = Annotations(),
    override val modifiers: MutableSet<Modifier> = mutableSetOf(),
) : ClassMemberOwner(false)

open class Function(
    val name: String,
    override val enclosingClass: ClassMemberOwner?,
    override val annotations: Annotations = Annotations(),
    override val modifiers: MutableSet<Modifier> = mutableSetOf(),
    val typeParameters: MutableList<TypeParameter> = mutableListOf(),
    val parameters: MutableList<MethodParameter> = mutableListOf(),
    val returnType: Pair<Class<*>, TypeArgument?>,
    val statements: Statements,
) : OnlyClassMember, Modifiable

class Getter(
    val property: Property,
    annotations: Annotations = Annotations(),
    modifiers: MutableSet<Modifier> = mutableSetOf(),
    statements: Statements,
) : Function("get${property.name.capitalize()}", property.enclosingClass, annotations, modifiers, mutableListOf(), mutableListOf(), property.type, statements)

class Setter(
    val property: Property,
    annotations: Annotations = Annotations(),
    modifiers: MutableSet<Modifier> = mutableSetOf(),
    statements: Statements,
) : Function("set${property.name.capitalize()}", property.enclosingClass, annotations, modifiers, mutableListOf(), mutableListOf(), property.type, statements)

class MethodParameter(
    val modifiers: MutableSet<Modifier> = mutableSetOf(),
    val annotations: Annotations = Annotations(),
    val name: String,
    val type: Type,
    val expression: Expression? = null,
)

class Property(
    val name: String,
    override val enclosingClass: ClassMemberOwner,
    override val annotations: Annotations = Annotations(),
    override val modifiers: MutableSet<Modifier> = mutableSetOf(),
    val type: Pair<Class<*>, TypeArgument?>,
    val initialValue: Expression?,
    val final: Boolean,
    val static: Boolean,
) : OnlyClassMember, Modifiable

class LoadScript(override val enclosingClass: ClassMemberOwner, val statements: Statements) : OnlyClassMember

class TypeParameter(
    val name: String,
    val constraints: Array<Type>,
)

abstract class Statement : Java

class SuperCall(val valueArguments: ValueArguments) : Statement() {
    
    override fun toJava(): String {
        val sb = StringBuilder()
        sb.append("super(")
        sb.append(valueArguments.toJava())
        sb.append(");")
        return sb.toString()
    }
    
}

class ReturnStatement(val expression: Expression) : Statement() {
    override fun toJava(): String {
        TODO("Not yet implemented")
    }
}

class LocalVariable(val name: String, val type: Pair<Class<*>, TypeArgument?>, val final: Boolean, val initialValue: Expression?) : Statement() {
    val annotations = Annotations()
    
    override fun toJava(): String {
        TODO("Not yet implemented")
    }
}

class ValueArgument(val annotations: Annotations, val value: Expression) : Java {
    override fun toJava(): String {
        TODO("Not yet implemented")
    }
}

class Assignment(val assignTo: AssignableExpression, val op: Operator, val assignFrom: Expression) : Statement() {
    enum class Operator {
        ASSIGN,
        DEFINE,
        ADD_ASSIGN,
        SUB_ASSIGN,
        MUL_ASSIGN,
        DIV_ASSIGN,
        MOD_ASSIGN,
        EXP_ASSIGN,
        CONJ_ASSIGN,
        DISJ_ASSIGN,
        XOR_ASSIGN,
        ELVIS_ASSIGN
    }
    
    override fun toJava(): String {
        TODO("Not yet implemented")
    }
}

class AssignableExpression(val expression: Expression, val assignableSuffixes: MutableList<AssignableSuffix>) {

}

interface AssignableSuffix

class IndexingSuffix(expressions: MutableList<Expression>) : AssignableSuffix {

}

class NavigationSuffix(val op: Operator, val identifier: String) : AssignableSuffix {
    enum class Operator {
        PERIOD,
        QUEST_PERIOD,
        DOUBLE_COLON
    }
}

abstract class LoopStatement : Statement()

class ForStatement(
    val annotations: Annotations,
    val variableDeclaration: VariableDeclaration?,
    val expression: Expression,
    val statements: Statements,
) : LoopStatement() {
    override fun toJava(): String {
        TODO("Not yet implemented")
    }
}

class WhileStatement(val expression: Expression, val statements: Statements) : LoopStatement() {
    override fun toJava(): String {
        TODO("Not yet implemented")
    }
}

class DoWhileStatement(val statements: Statements, val expression: Expression) : LoopStatement() {
    override fun toJava(): String {
        TODO("Not yet implemented")
    }
}

class Expression(val disjunction: Disjunction) : Statement() {
    override fun toJava(): String {
        return disjunction.toJava()
    }
}

class Disjunction(val conjunction: Conjunction, val additionalConjunctions: MutableList<Conjunction>) : Java {
    override fun toJava(): String {
        val sb = StringBuilder()
        sb.append(conjunction.toJava())
        if (additionalConjunctions.isNotEmpty()) {
            sb.append(additionalConjunctions.joinToString(" || ", " || ") { it.toJava() })
        }
        return sb.toString()
    }
}

class Conjunction(val equalityComparison: EqualityComparison, val additionalEqualityComparisons: MutableList<EqualityComparison>) : Java {
    override fun toJava(): String {
        val sb = StringBuilder()
        sb.append(equalityComparison.toJava())
        if (additionalEqualityComparisons.isNotEmpty()) {
            sb.append(additionalEqualityComparisons.joinToString(" || ", " || ") { it.toJava() })
        }
        return sb.toString()
    }
}

class EqualityComparison(val identityComparison: IdentityComparison, val additionalIdentityComparisons: MutableList<IdentityComparison>) : Java {
    override fun toJava(): String {
        val sb = StringBuilder()
        sb.append(identityComparison.toJava())
        if (additionalIdentityComparisons.isNotEmpty()) {
            sb.append(additionalIdentityComparisons.joinToString("") { ".equals(" + it.toJava() + ")" })
        }
        return sb.toString()
    }
}

class IdentityComparison(val comparison: Comparison, val additionalComparisons: MutableList<Comparison>) : Java {
    override fun toJava(): String {
        val sb = StringBuilder()
        sb.append(comparison.toJava())
        if (additionalComparisons.isNotEmpty()) {
            sb.append(additionalComparisons.joinToString(" == ", " == ") { it.toJava() })
        }
        return sb.toString()
    }
}

class Comparison(val namedInfixExpression: NamedInfixExpression, val additionalNamedInfixExpressions: MutableList<Pair<Operator, NamedInfixExpression>>) : Java {
    enum class Operator {
        LT, GT, LEQ, GEQ
    }
    
    override fun toJava(): String {
        TODO("Not yet implemented")
    }
}

class CallSuffix(val typeArguments: TypeArgument?, val lambdaCallSuffix: LambdaCallSuffix?, val valueArguments: ValueArguments?) : Statement() {
    override fun toJava(): String {
        TODO("Not yet implemented")
    }
}

class LambdaCallSuffix(val valueArguments: ValueArguments?, val annotatedLambda: AnnotatedLambda) : Statement() {
    override fun toJava(): String {
        TODO("Not yet implemented")
    }
}

class AnnotatedLambda(val annotations: Annotations, val lambdaLiteral: LambdaLiteral) : Statement() {
    override fun toJava(): String {
        TODO("Not yet implemented")
    }
}

class LambdaLiteral(val parameters: MutableList<LambdaParameter>, val statements: Statements) {

}

class LambdaParameter(val variableDeclaration: VariableDeclaration?, val type: Type?)

class VariableDeclaration(val annotations: Annotations, val name: String, val type: Type?)

class NamedInfixExpression(val elvisExpression: ElvisExpression, val expressions: MutableList<Pair<Operator, ElvisOrType>> = mutableListOf()) {
    
    enum class Operator {
        IN, NOT_IN, IS, NOT_IS
    }
    
    class ElvisOrType(val elvis: ElvisExpression?, val type: Type?)
    
}

class ElvisExpression(
    val infixFunctionCall: InfixFunctionCall,
    val additionalInfixFunctionCalls: MutableList<InfixFunctionCall>,
)

class InfixFunctionCall(
    val rangeExpression: RangeExpression,
    val additionalRangeExpressions: MutableList<Pair<String, RangeExpression>>,
)

class RangeExpression(
    val xorExpression: XorExpression,
    val operator: Operator?,
    val to: XorExpression?,
) {
    enum class Operator {
        TO, // up, inclusive
        DOWNTO, // down, inclusive
        UNTIL // up, exclusive
    }
}

class XorExpression(
    val additiveExpression: AdditiveExpression,
    val additionalAdditiveExpressions: MutableList<AdditiveExpression>,
)

class AdditiveExpression(
    val multiplicativeExpression: MultiplicativeExpression,
    val additionalMultiplicativeExpressions: MutableList<Pair<Operator, MultiplicativeExpression>>,
) {
    enum class Operator {
        PLUS, MINUS
    }
}

class MultiplicativeExpression(
    val exponentialExpression: ExponentialExpression,
    val additionalExponentialExpressions: MutableList<Pair<Operator, ExponentialExpression>>,
) {
    enum class Operator {
        MUL, DIV, MOD
    }
}

class ExponentialExpression(
    val asExpression: AsExpression,
    val additionalAsExpressions: MutableList<AsExpression>,
)

class AsExpression(
    val prefixUnaryExpression: PrefixUnaryExpression,
    val typeCasts: MutableList<Pair<Operator, Type>>,
) {
    enum class Operator {
        AS, AS_QUEST
    }
}

class PrefixUnaryExpression(
    val unaryPrefixes: MutableList<UnaryPrefix>,
    val postfixUnaryExpression: PostfixUnaryExpression,
)

enum class UnaryPrefix {
    INCR,
    DECR,
    ADD,
    SUB,
    EXCL,
    DOUBLE_AT
}

class PostfixUnaryExpression(
    val atomicExpression: AtomicExpression,
    val unaryPostfixes: MutableList<UnaryPostfix>,
)

class UnaryPostfix(
    val postfixUnaryOperator: PostfixUnaryOperator?,
    val typeArguments: TypeArgument?,
    val callSuffix: CallSuffix?,
    val indexingSuffix: IndexingSuffix?,
    val navigationSuffix: NavigationSuffix?,
) {
    constructor(postfixUnaryOperator: PostfixUnaryOperator) : this(postfixUnaryOperator, null, null, null, null)
    constructor(typeArguments: TypeArgument) : this(null, typeArguments, null, null, null)
    constructor(callSuffix: CallSuffix) : this(null, null, callSuffix, null, null)
    constructor(indexingSuffix: IndexingSuffix) : this(null, null, null, indexingSuffix, null)
    constructor(navigationSuffix: NavigationSuffix) : this(null, null, null, null, navigationSuffix)
}

enum class PostfixUnaryOperator {
    INCR,
    DECR,
    DOUBLE_EXCL
}

class AtomicExpression(
    val parenthesizedExpression: Expression?,
    val simpleIdentifier: String?,
    val literalConstant: LiteralConstant?,
    val contextualReference: MutableList<String>?,
    val callableReference: CallableReference?,
    val lambdaLiteral: LambdaLiteral?,
    val collectionLiteral: MutableList<Expression>?,
    val thisLiteral: ThisLiteral?,
    val superExpression: SuperLiteral?,
    val conditionalExpression: ConditionalExpression?,
    val optionalTryExpression: OptionalTryExpression?,
    val tryExpression: TryExpression?,
    val jumpExpression: JumpExpression?,
)

object ThisLiteral
object SuperLiteral

class LiteralConstant(
    val nullLiteral: Null?,
    val boolLiteral: Boolean?,
    val trileanLiteral: Trilean?,
    val integerLiteral: Int?,
    val longLiteral: Long?,
    val shortLiteral: Short?,
    val byteLiteral: Byte?,
    val floatLiteral: Float?,
    val doubleLiteral: Double?,
    val complexLiteral: Complex?,
    val characterLiteral: Char?,
    val stringLiteral: String?,
)

object Null

class CallableReference(
    val type: ReceiverType?,
    val identifier: String,
)

interface ConditionalExpression

class IfExpression(
    val unless: Boolean,
    val condition: Expression,
    val statements: Statements,
    val elsifExpressions: MutableList<ElsifExpression>,
    val elseStatements: Statements?,
) : ConditionalExpression

class ElsifExpression(
    val condition: Expression,
    val statements: Statements,
)

class MatchExpression(
    val expression: Expression,
    val matchEntries: MutableList<MatchEntry>,
) : ConditionalExpression

class MatchEntry(
    val default: Boolean,
    val cases: MutableList<LiteralConstant>,
    val statements: Statements,
)

class OptionalTryExpression(
    val statements: Statements?,
    val expression: Expression?,
)

class TryExpression(
    val statements: Statements,
    val catchBlocks: MutableList<CatchBlock>?,
    val finallyBlock: FinallyBlock?,
)

class CatchBlock(
    val annotations: Annotations,
    val name: String,
    val types: MutableList<Type>,
    val statements: Statements,
)

class FinallyBlock(val statements: Statements)

interface JumpExpression

class TriggerExpression(val expression: Expression) : JumpExpression

class ReturnExpression(val expression: Expression) : JumpExpression

object ContinueExpression : JumpExpression
object BreakExpression : JumpExpression
