package aprl.compiler.psi.aprl

import aprl.compiler.error.ErrorProne
import aprl.compiler.error.TypeInferenceError
import aprl.compiler.psi.INVALID
import aprl.compiler.psi.Position
import java.io.File
import aprl.compiler.psi.java.Parameter as JParameter

class Parameter(
    override val file: File,
    override val position: Position,
    override val name: SimpleIdentifier,
    val type: TypeReference,
) : Named, ErrorProne {
    
    fun toJavaParameter(): JParameter {
        val javaName = name.toJavaIdentifier()
        val javaType = type.toType() ?: throw TypeInferenceError(file, position)
        return JParameter(INVALID, javaName, javaType)
    }
    
}
