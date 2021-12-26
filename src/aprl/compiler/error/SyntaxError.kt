package aprl.compiler.error

import aprl.compiler.psi.Position
import java.io.File

class SyntaxError(
    val file: File,
    val position: Position,
    message: String,
) : Error("${file.path}:${position.first}:${position.second} - $message"), Comparable<SyntaxError> {
    
    override fun compareTo(other: SyntaxError): Int {
        return when {
            position.first < other.position.first -> -1
            position.first > other.position.first -> 1
            position.second < other.position.second -> -1
            position.second > other.position.second -> 1
            else -> 0
        }
    }
    
    override fun equals(other: Any?): Boolean {
        return other is SyntaxError && message == other.message
    }
    
}
