package aprl.compiler.psi.java

sealed interface Annotatable {
    val annotations: List<AnnotationReference>
}