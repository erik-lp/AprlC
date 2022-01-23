package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position
import java.lang.reflect.Type

class TypeReference(
    override val position: Position,
    val annotations: List<AnnotationReference>,
    val functionType: FunctionType?,
    val parenthesizedType: TypeReference?,
    val arrayType: ArrayType?,
    val nullableType: NullableType?,
    val identifier: Pair<Identifier, List<TypeProjection>?>?
) : Token {
    
    fun toType(): Type? {
        return functionType?.toType()
            ?: parenthesizedType?.toType()
            ?: arrayType?.toType()
            ?: nullableType?.toType()
            ?: qualifiedNameToType(identifier!!)
    }
    
}
