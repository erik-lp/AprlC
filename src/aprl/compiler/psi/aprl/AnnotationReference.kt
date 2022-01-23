package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position
import aprl.compiler.psi.java.AnnotationReference as JAnnotationReference

class AnnotationReference(
    override val position: Position,
    val unescapedAnnotations: List<UnescapedAnnotation>
) : Token {
    
    fun toJavaAnnotationReference(): JAnnotationReference {
    
    }
    
}
