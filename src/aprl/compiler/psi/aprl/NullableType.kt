package aprl.compiler.psi.aprl

import aprl.compiler.error.ErrorProne
import aprl.compiler.psi.Position
import org.jetbrains.annotations.Nullable
import java.io.File
import java.lang.reflect.AnnotatedType

class NullableType(
    override val file: File,
    override val position: Position,
    val identifier: Pair<Identifier, List<TypeProjection>?>?,
    val parenthesizedType: TypeReference?,
    val arrayType: ArrayType?,
) : Token, ErrorProne {
    
    fun toType(): AnnotatedType? {
        val baseType = arrayType?.toType()
            ?: parenthesizedType?.toType()
            ?: qualifiedNameToType(identifier!!)
        return baseType?.let {
            object : AnnotatedType {
                override fun <T : Annotation> getAnnotation(annotationClass: Class<T>) = annotationClass.cast(Nullable::class.java)
                override fun getAnnotations() = declaredAnnotations
                override fun getDeclaredAnnotations() = arrayOf(Nullable::class.java.cast(Nullable::class.java))
                override fun getType() = it
            }
        }
    }
    
}
