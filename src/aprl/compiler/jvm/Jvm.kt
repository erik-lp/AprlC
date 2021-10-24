package aprl.compiler.jvm

import kotlin.math.pow

sealed interface ClassMember
sealed interface StructMember // TODO: StructMember
sealed interface TopLevelObject
sealed interface NestedTopLevelObject : ClassMember

interface Java {
    fun toJava(): String
}

class Constructor(val clazz: Clazz, val annotations: Annotations, val modifiers: MutableList<Modifier>, val parameters: MutableList<JavaParameter>, val statements: Statements) : Java, ClassMember {
    
    override fun toJava(): String {
        val sb = StringBuilder()
        with(annotations) { sb.append(toJava() + if (isNotEmpty()) "\n" else "") }
        sb.append(modifiers.joinToString("") { it.toJava() })
        sb.append(clazz.name)
        sb.append("(" + parameters.joinToString(", ") { it.toJava() } + ") {")
        sb.append(statements.joinToString { it.toJava().prependIndent() + "\n" })
        sb.append("}")
        return sb.toString()
    }
    
}

class Field(val name: String, val type: Type, val initialValue: Expression?, val final: Boolean, val static: Boolean) : Java {
    val annotations: Annotations = mutableListOf()
    val modifiers: MutableList<Modifier> = mutableListOf()
    
    override fun toJava(): String {
        TODO("Not yet implemented")
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
    SAMPLE("abstract "),
    FINAL("final "),
    OPEN(null),
    COVER(null),
    PARAMS(null),
    INLINE(null),
    SYNC("synchronized "),
    EXTERNAL("native ");
    
    fun `class`() = this in PUBLIC..OPEN
    fun function() = this in PUBLIC..COVER || this in INLINE..EXTERNAL
    fun property() = this in PUBLIC..COVER
    fun parameter() = this == PARAMS
    
    override fun toJava(): String = java ?: throw InternalError("$this does not have a java equivalent")
    
}

class Clazz(val name: String) : TopLevelObject, NestedTopLevelObject {
    
    val annotations: Annotations = mutableListOf()
    val modifiers: MutableList<Modifier> = mutableListOf()
    val typeParameters: MutableList<TypeParameter> = mutableListOf()
    
    val superClasses: MutableList<Type> = mutableListOf()
    
    val classMembers: MutableList<ClassMember> = mutableListOf()
    
}

class Struct(val name: String) : TopLevelObject, NestedTopLevelObject {
    
    val annotations: Annotations? = null
    val modifiers: MutableList<Modifier>? = null
    
    val superClasses: MutableList<Type>? = null
    
    val structMembers: MutableList<StructMember>? = null
    
}

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

class LocalVariable(val name: String, val type: Pair<Class<*>, TypeArgument?>, val final: Boolean, val initialValue: Expression?) : Statement() {
    val annotations: Annotations = mutableListOf()
    
    override fun toJava(): String {
        TODO("Not yet implemented")
    }
}

class ValueArgument(val value: Expression) : Java {
    
    val annotations: Annotations = mutableListOf()
    lateinit var expression: Expression
    
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

class ForStatement(val annotations: Annotations, val variableDeclaration: VariableDeclaration?, val multiVariableDeclaration: MultiVariableDeclaration?, val expression: Expression, val statements: Statements) : LoopStatement() {
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

class Comparison(val callExpression: CallExpression, val additionalCallExpressions: MutableList<Pair<Operator, CallExpression>>) : Java {
    enum class Operator {
        LT, GT, LEQ, GEQ, SPACESHIP
    }
    override fun toJava(): String {
        TODO("Not yet implemented")
    }
}

class CallExpression(val namedInfixExpression: NamedInfixExpression, val callSuffixes: MutableList<CallSuffix>) : Statement() {
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

class AnnotatedLambda(val annotations: Annotations, val label: String?, val lambdaLiteral: LambdaLiteral) : Statement() {
    override fun toJava(): String {
        TODO("Not yet implemented")
    }
}

class LambdaLiteral(val parameters: MutableList<LambdaParameter>, val statements: Statements) : FunctionLiteral {

}

class LambdaParameter(val variableDeclaration: VariableDeclaration?, val multiVariableDeclaration: MultiVariableDeclaration?, val type: Type?)

class VariableDeclaration(val annotations: Annotations, val name: String, val type: Type)

class MultiVariableDeclaration(val variableDeclaration: VariableDeclaration, val additionalVariableDeclarations: MutableList<VariableDeclaration>)

class NamedInfixExpression {
    
    private class ElvisOrType private constructor(private val elvis: ElvisExpression?, private val type: Type?) {
        constructor(elvis: ElvisExpression): this(elvis, null)
        constructor(type: Type): this(null, type)
    }
    
    var elvisExpression: ElvisExpression? = null
    private var expressions: MutableList<Pair<Boolean, ElvisOrType>>? = null // FIXME
    
}

class ElvisExpression {
    var infixFunctionCall: InfixFunctionCall? = null
    var additionalInfixFunctionCalls: MutableList<InfixFunctionCall>? = null
}

class InfixFunctionCall {
    var rangeExpression: RangeExpression? = null
    var additionalRangeExpressions: MutableList<RangeExpression>? = null
}

class RangeExpression {
    var xorExpression: XorExpression? = null
    var to: XorExpression? = null
}

class XorExpression {
    var additiveExpression: AdditiveExpression? = null
    var additionalAdditiveExpressions: MutableList<AdditiveExpression>? = null
}

class AdditiveExpression {
    var multiplicativeExpression: MultiplicativeExpression? = null
    var additionalMultiplicativeExpressions: MutableList<MultiplicativeExpression>? = null
}

class MultiplicativeExpression {
    var exponentialExpression: ExponentialExpression? = null
    var additionalExponentialExpressions: MutableList<ExponentialExpression>? = null
}

class ExponentialExpression {
    var asExpression: AsExpression? = null
    var additionalAsExpressions: MutableList<AsExpression>? = null
}

class AsExpression {
    var prefixUnaryExpression: PrefixUnaryExpression? = null
    var typeCasts: MutableList<Type>? = null
}

class PrefixUnaryExpression {
    var unaryPrefixes: MutableList<UnaryPrefix>? = null
    var postfixUnaryExpression: PostfixUnaryExpression? = null
}

enum class UnaryPrefix {
    PLUSPLUS
}

class PostfixUnaryExpression {
    var atomicExpression: AtomicExpression? = null
    var unaryPostfixes: MutableList<UnaryPostfix>? = null
}

enum class UnaryPostfix {
    PLUSPLUS
}

class AtomicExpression {
    var parenthesizedExpression: Expression? = null
    var simpleIdentifier: String? = null
    var literalConstant: LiteralConstant? = null
    var contextualReference: Identifier? = null
    var callableReference: CallableReference? = null
    var functionLiteral: FunctionLiteral? = null
    var anonymousObjectLiteral: AnonymousObject? = null
    var collectionLiteral: MutableList<Expression>? = null
    var thisExpression: String? = null
    var superExpression: Pair<Type?, String?>? = null
    var conditionalExpression: ConditionalExpression? = null
    var optionalTryExpression: OptionalTryExpression? = null
    var tryExpression: TryExpression? = null
    var jumpExpression: JumpExpression? = null
}

class LiteralConstant {
    var nullLiteral: Nothing? = null
    var boolLiteral: Boolean? = null
    var trileanLiteral: Trilean? = null
    var integerLiteral: Int? = null
    var longLiteral: Long? = null
    var shortLiteral: Short? = null
    var byteLiteral: Byte? = null
    var floatLiteral: Float? = null
    var doubleLiteral: Double? = null
    var complexLiteral: Complex? = null
    var characterLiteral: Char? = null
    var stringLiteral: String? = null
}

enum class Trilean {
    TRUE,
    FALSE,
    NONE
}

data class Complex(private var real: Double, private var imaginary: Double) {
    
    operator fun plus(other: Complex) = Complex(real + other.real, imaginary + other.imaginary)
    
    operator fun minus(other: Complex) = Complex(real - other.real, imaginary - other.imaginary)
    
    operator fun times(other: Complex): Complex {
        val a = (real * other.real) - (imaginary * other.real)
        val b = (imaginary * other.real) + (real * other.imaginary)
        return Complex(a, b)
    }
    
    operator fun div(other: Complex): Complex {
        val a: Double = (real * other.real) + (imaginary * other.imaginary)
        val b: Double = other.real.pow(2) + other.imaginary.pow(2)
        val c: Double = (imaginary * other.real) - (real * other.imaginary) // bc - ad
        return Complex(a / b, c / b)
    }
    
    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if (other !is Complex) {
            return false
        }
        return other.real == this.real && other.imaginary == this.imaginary
    }
    
    override fun hashCode() = 31 * real.hashCode() + imaginary.hashCode()
    
}

class CallableReference {
    var type: ReceiverType? = null
    var identifier: String? = null
}

interface FunctionLiteral

class AnonymousFunction : FunctionLiteral {

}

class AnonymousObject {

}

interface ConditionalExpression

class IfExpression : ConditionalExpression {

}

class MatchExpression : ConditionalExpression {

}

class OptionalTryExpression {

}

class TryExpression {

}

interface JumpExpression

class TriggerExpression : JumpExpression {

}

class ReturnExpression : JumpExpression {

}

class ContinueExpression : JumpExpression {

}

class BreakExpression : JumpExpression {

}

class Interface(val name: String) : TopLevelObject, NestedTopLevelObject {

}

class Annotation(val name: String) : TopLevelObject, NestedTopLevelObject {

}

class Enum(val name: String) : TopLevelObject, NestedTopLevelObject {

}

class Document(val name: String) : TopLevelObject, NestedTopLevelObject {

}

class Function(val name: String, val returnType: Type) : TopLevelObject, NestedTopLevelObject {
    var annotations: Annotations? = null
    var modifiers: MutableList<Modifier>? = null
    var parameters: MutableList<MethodParameter>? = null
    var statements: Statements? = null
}

data class MethodParameter(val name: String, val type: Type)

class Property(val name: String, val type: Type, val initialValue: Expression? = null, val static: Boolean = false) : TopLevelObject, NestedTopLevelObject {
    var annotations: Annotations? = null
    var modifiers: MutableList<Modifier>? = null
}

class LoadScript(val statements: Statements) : ClassMember

@Suppress("ArrayInDataClass")
data class TypeParameter(val name: String, val constraints: Array<Type>)
