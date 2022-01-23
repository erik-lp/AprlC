package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position
import java.lang.reflect.Type

class Conjunction(
    override val position: Position,
    val equalityComparisons: List<EqualityComparison>
) : Token {
    
    fun inferType(): Type? {
    
    }
    
}
