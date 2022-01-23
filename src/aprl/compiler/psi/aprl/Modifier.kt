package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position
import aprl.compiler.psi.java.Modifier as JModifier

class Modifier(
    override val position: Position,
    val modifier: RawModifier
) : Token, Comparable<Modifier> {
    
    enum class Target(private vararg val implied: RawModifier) {
        CLASS(RawModifier.FINAL),
        INTERFACE(RawModifier.ABSTRACT, RawModifier.OPEN),
        STRUCT(RawModifier.FINAL),
        ANNOTATION(RawModifier.FINAL),
        DOCUMENT(RawModifier.FINAL),
        PROPERTY,
        FUNCTION,
        GETTER,
        SETTER,
        PARAMETER;
        
        fun implies(modifier: Modifier): Boolean {
            return modifier.modifier in (implied.toList() + RawModifier.PUBLIC)
        }
        
        override fun toString(): String {
            return super.toString().lowercase()
        }
    }
    
    enum class RawModifier(vararg val targets: Target) {
        
        PUBLIC(Target.CLASS, Target.INTERFACE, Target.STRUCT, Target.ANNOTATION, Target.DOCUMENT, Target.FUNCTION, Target.GETTER, Target.SETTER, Target.PROPERTY),
        LOCAL(Target.CLASS, Target.INTERFACE, Target.STRUCT, Target.ANNOTATION, Target.DOCUMENT, Target.FUNCTION, Target.GETTER, Target.SETTER, Target.PROPERTY),
        BOUNDED(Target.CLASS, Target.INTERFACE, Target.STRUCT, Target.ANNOTATION, Target.DOCUMENT, Target.FUNCTION, Target.GETTER, Target.SETTER, Target.PROPERTY),
        PRIVATE(Target.CLASS, Target.INTERFACE, Target.STRUCT, Target.ANNOTATION, Target.DOCUMENT, Target.FUNCTION, Target.GETTER, Target.SETTER, Target.PROPERTY),
        ABSTRACT(Target.CLASS, Target.INTERFACE, Target.FUNCTION, Target.PROPERTY),
        FINAL(Target.CLASS, Target.INTERFACE, Target.STRUCT, Target.ANNOTATION, Target.DOCUMENT, Target.FUNCTION, Target.PROPERTY),
        OPEN(Target.CLASS, Target.INTERFACE, Target.FUNCTION, Target.PROPERTY),
        COVER(Target.FUNCTION, Target.PROPERTY),
        PARAMS(Target.PARAMETER),
        BLUEPRINT(Target.PARAMETER),
        INLINE(Target.FUNCTION, Target.GETTER, Target.SETTER),
        SYNC(Target.FUNCTION, Target.GETTER, Target.SETTER),
        EXTERNAL(Target.FUNCTION);
        
        fun compatible(other: RawModifier): Boolean {
            return other !in when (this) {
                PUBLIC -> arrayOf(LOCAL, BOUNDED, PRIVATE)
                LOCAL -> arrayOf(PUBLIC, BOUNDED, PRIVATE)
                BOUNDED -> arrayOf(PUBLIC, LOCAL, PRIVATE)
                PRIVATE -> arrayOf(PUBLIC, LOCAL, BOUNDED)
                ABSTRACT -> arrayOf(FINAL, INLINE, EXTERNAL, SYNC)
                FINAL -> arrayOf(ABSTRACT, OPEN)
                OPEN -> arrayOf(FINAL, INLINE, EXTERNAL, SYNC)
                COVER -> arrayOf()
                PARAMS -> arrayOf()
                BLUEPRINT -> arrayOf()
                INLINE -> arrayOf(ABSTRACT, OPEN, EXTERNAL)
                SYNC -> arrayOf(ABSTRACT, OPEN)
                EXTERNAL -> arrayOf(INLINE, ABSTRACT, OPEN)
            }
        }
        
        fun compare(other: RawModifier): Int {
            return when (other) {
                this -> 0
                in when (this) {
                    PUBLIC -> arrayOf()
                    LOCAL -> arrayOf()
                    BOUNDED -> arrayOf()
                    PRIVATE -> arrayOf()
                    OPEN -> arrayOf(PUBLIC, LOCAL, BOUNDED, PRIVATE)
                    ABSTRACT -> arrayOf(PUBLIC, LOCAL, BOUNDED, PRIVATE, OPEN)
                    FINAL -> arrayOf(PUBLIC, LOCAL, BOUNDED, PRIVATE)
                    EXTERNAL -> arrayOf(PUBLIC, LOCAL, BOUNDED, PRIVATE, OPEN, ABSTRACT, FINAL)
                    COVER -> arrayOf(PUBLIC, LOCAL, BOUNDED, PRIVATE, OPEN, ABSTRACT, FINAL, EXTERNAL)
                    PARAMS -> arrayOf()
                    BLUEPRINT -> arrayOf(PARAMS)
                    INLINE -> arrayOf(PUBLIC, LOCAL, BOUNDED, PRIVATE, OPEN, ABSTRACT, FINAL, EXTERNAL)
                    SYNC -> arrayOf(PUBLIC, LOCAL, BOUNDED, PRIVATE, OPEN, ABSTRACT, FINAL, EXTERNAL, INLINE)
                } -> 1
                else -> -1
            }
        }
        
    }
    
    fun compatible(other: Modifier): Boolean {
        return modifier.compatible(other.modifier)
    }
    
    fun applicable(target: Target): Boolean {
        return target in modifier.targets
    }
    
    override fun compareTo(other: Modifier): Int {
        return modifier.compare(other.modifier)
    }
    
    fun toJavaModifier(): JModifier {
    
    }
    
}
