package aprl.compiler.error

import aprl.compiler.psi.Position
import java.io.File

class SyntaxWarning(
    val file: File,
    val position: Position,
    message: String,
) : RuntimeException("${file.path}:${position.first}:${position.second} - $message"), Comparable<SyntaxWarning> {
    
    override fun compareTo(other: SyntaxWarning): Int {
        return when {
            position.first < other.position.first -> -1
            position.first > other.position.first -> 1
            position.second < other.position.second -> -1
            position.second > other.position.second -> 1
            else -> 0
        }
    }
    
    override fun equals(other: Any?): Boolean {
        return other is SyntaxWarning && message == other.message
    }
    
}
