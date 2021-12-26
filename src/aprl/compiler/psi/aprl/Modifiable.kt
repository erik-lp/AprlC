package aprl.compiler.psi.aprl

sealed interface Modifiable : Token {
    val modifiers: ModifierList
}
