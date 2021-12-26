package aprl.compiler.psi.aprl

sealed interface Annotatable : Token {
    val annotations: List<AnnotationReference>
}
