package aprl.compiler.psi.java

import aprl.compiler.psi.INVALID
import aprl.compiler.psi.Position

class Modifier(
    override val position: Position,
    val modifier: RawModifier
) : Token {
    
    enum class Target {
        CLASS,
        INTERFACE,
        ANNOTATION,
        RECORD,
        FIELD,
        METHOD,
        PARAMETER;
    }
    
    enum class RawModifier {
        PUBLIC,
        PROTECTED,
        PRIVATE,
        STATIC,
        ABSTRACT,
        FINAL,
        STRICTFP,
        NATIVE,
        SYNCHRONIZED,
        TRANSIENT,
        VOLATILE;
    }
    
    companion object {
        fun public(position: Position = INVALID) = Modifier(position, RawModifier.PUBLIC)
        fun protected(position: Position = INVALID) = Modifier(position, RawModifier.PROTECTED)
        fun private(position: Position = INVALID) = Modifier(position, RawModifier.PRIVATE)
        fun static(position: Position = INVALID) = Modifier(position, RawModifier.STATIC)
        fun abstract(position: Position = INVALID) = Modifier(position, RawModifier.ABSTRACT)
        fun final(position: Position = INVALID) = Modifier(position, RawModifier.FINAL)
        fun strictfp(position: Position = INVALID) = Modifier(position, RawModifier.STRICTFP)
        fun native(position: Position = INVALID) = Modifier(position, RawModifier.NATIVE)
        fun synchronized(position: Position = INVALID) = Modifier(position, RawModifier.SYNCHRONIZED)
        fun transient(position: Position = INVALID) = Modifier(position, RawModifier.TRANSIENT)
        fun volatile(position: Position = INVALID) = Modifier(position, RawModifier.VOLATILE)
    }
    
}