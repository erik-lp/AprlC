package aprl.compiler.psi.aprl

import aprl.compiler.error.ErrorCollector
import aprl.compiler.error.SyntaxError
import aprl.compiler.error.SyntaxWarning
import aprl.compiler.psi.Position
import java.io.File

sealed interface Token {
    
    val errors: ErrorCollector<SyntaxError>
    val warnings: ErrorCollector<SyntaxWarning>
    val file: File
    val position: Position
    
    fun ERROR(message: String) {
        val error = SyntaxError(file, position, message)
        errors.collect(error)
    }
    
    fun WARN(message: String) {
        val warning = SyntaxWarning(file, position, message)
        warnings.collect(warning)
    }
    
}
