package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position
import com.sun.jdi.ArrayType
import java.lang.reflect.Type

class ArrayType(
    override val position: Position,
    val type: TypeReference,
) : Token {
    
    fun toType(): Type? {
        val baseType = type.toType()
        
    }
    
}
