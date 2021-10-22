package aprl.compiler.jvm

import kotlin.math.pow

sealed interface ClassMember
sealed interface StructMember // TODO: StructMember
sealed interface TopLevelObject : ClassMember

enum class Modifier(private val java: String?) {
    
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
    
    fun toJava(): String = java ?: throw InternalError("$this does not have a java equivalent")
    
}

class Clazz(val name: String) : TopLevelObject {
    
    val annotations: Annotations = mutableListOf()
    val modifiers: MutableList<Modifier> = mutableListOf()
    val typeParameters: MutableList<TypeParameter> = mutableListOf()
    
    val superClasses: MutableList<Type> = mutableListOf()
    
    val classMembers: MutableList<ClassMember> = mutableListOf()
    
}

class Struct(val name: String) : TopLevelObject {
    
    val annotations: Annotations? = null
    val modifiers: MutableList<Modifier>? = null
    
    val superClasses: MutableList<Type>? = null
    
    val structMembers: MutableList<StructMember>? = null
    
}

class Constructor(val clazz: Clazz) : TopLevelObject {
    val annotations: Annotations? = null
    val modifiers: MutableList<Modifier>? = null
    val thisParameters: ValueArguments? = null
    val superParameters: ValueArguments? = null
    val statements: Statements? = null
}

class Statement {

}

class ValueArgument(val value: Expression) : Java {
    
    val annotations: Annotations = mutableListOf()
    lateinit var expression: Expression
    
    override fun toJava(): String {
        TODO("Not yet implemented")
    }
    
}

class Expression : Java {
    lateinit var disjunction: Disjunction
    
    override fun toJava(): String {
        return disjunction.toJava()
    }
}

class Disjunction : Java {
    lateinit var conjunction: Conjunction
    lateinit var additionalConjunctions: MutableList<Conjunction>
    
    override fun toJava(): String {
        val sb = StringBuilder()
        sb.append(conjunction.toJava())
        if (additionalConjunctions.isNotEmpty()) {
            sb.append(additionalConjunctions.joinToString(" || ", " || ") { it.toJava() })
        }
        return sb.toString()
    }
}

class Conjunction : Java {
    lateinit var equalityComparison: EqualityComparison
    lateinit var additionalEqualityComparisons: MutableList<EqualityComparison>
    
    override fun toJava(): String {
        val sb = StringBuilder()
        sb.append(equalityComparison.toJava())
        if (additionalEqualityComparisons.isNotEmpty()) {
            sb.append(additionalEqualityComparisons.joinToString(" || ", " || ") { it.toJava() })
        }
        return sb.toString()
    }
}

class EqualityComparison : Java {
    lateinit var identityComparison: IdentityComparison
    lateinit var additionalIdentityComparisons: MutableList<IdentityComparison>
    
    override fun toJava(): String {
        // TODO: EqualityComparison.toJava()
        return "<EQUALITY_COMPARISON>"
    }
}

class IdentityComparison {
    var comparison: Comparison? = null
    var additionalComparisons: MutableList<Comparison>? = null
}

class Comparison {
    var callExpression: CallExpression? = null
    var additionalCallExpressions: MutableList<CallExpression>? = null
}

class CallExpression {
    var namedInfixExpression: NamedInfixExpression? = null
    var callSuffix: CallSuffix? = null
}

class CallSuffix {
    var typeArguments: MutableList<TypeArgument>? = null
    var lambdaCallSuffix: LambdaCallSuffix? = null
    var valueArguments: ValueArguments? = null
}

class LambdaCallSuffix {
    var valueArguments: ValueArguments? = null
    var annotatedLambda: AnnotatedLambda? = null
}

class AnnotatedLambda {
    var annotations: Annotations? = null
    var label: String? = null
    var lambdaLiteral: LambdaLiteral? = null
}

class LambdaLiteral : FunctionLiteral {
    var parameters: MutableList<LambdaParameter>? = null
    var statements: Statements? = null
}

class LambdaParameter {
    var variableDeclaration: VariableDeclaration? = null
    var multiVariableDeclaration: MultiVariableDeclaration? = null
    var type: Type? = null
}

class VariableDeclaration {
    var annotations: Annotations? = null
    var name: String? = null
    var type: Type? = null
}

class MultiVariableDeclaration {
    var variableDeclaration: VariableDeclaration? = null
    var additionalVariableDeclarations: MutableList<VariableDeclaration>? = null
}

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

class Interface(val name: String) : TopLevelObject {

}

class Annotation(val name: String) : TopLevelObject {

}

class Enum(val name: String) : TopLevelObject {

}

class Document(val name: String) : TopLevelObject {

}

class Function(val name: String, val returnType: Type) : TopLevelObject {
    var annotations: Annotations? = null
    var modifiers: MutableList<Modifier>? = null
    var parameters: MutableList<MethodParameter>? = null
    var statements: Statements? = null
}

data class MethodParameter(val name: String, val type: Type)

class Property(val name: String, val type: Type, val initialValue: Expression? = null, val static: Boolean = false) : TopLevelObject {
    var annotations: Annotations? = null
    var modifiers: MutableList<Modifier>? = null
}

class LoadScript : ClassMember {
    var statements: Statements? = null
}

@Suppress("ArrayInDataClass")
data class TypeParameter(val name: String, val constraints: Array<Type>)
