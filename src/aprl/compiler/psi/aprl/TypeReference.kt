package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class TypeReference(
    override val position: Position,
    val annotations: List<AnnotationReference>,
    val functionType: FunctionType?,
    val parenthesizedType: TypeReference?,
    val arrayType: ArrayType?,
    val nullableType: NullableType?,
    val identifier: Pair<Identifier, List<TypeProjection>?>?
) : Token
