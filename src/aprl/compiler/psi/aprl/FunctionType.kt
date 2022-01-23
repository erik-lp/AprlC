package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position
import java.lang.reflect.Type

class FunctionType(
    override val position: Position,
    val types: List<TypeReference>,
    val returnType: TypeReference,
) : Token {
    
    fun toType(): Type? {
        val parameterTypes = types.map { it.toType() }
        val returnType = returnType.toType()
        // TODO: construct functional `Function` interface from these types
    }
    
}
