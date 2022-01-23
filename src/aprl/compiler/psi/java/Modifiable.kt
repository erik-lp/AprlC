package aprl.compiler.psi.java

sealed interface Modifiable : Token {
    val modifiers: ModifierList
}