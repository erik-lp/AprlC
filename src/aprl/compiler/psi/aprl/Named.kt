package aprl.compiler.psi.aprl

sealed interface Named : Token {
    val name: SimpleIdentifier
}
