package aprl.compiler.psi.java

sealed interface Named : Token {
    val name: SimpleIdentifier
}
