package aprl.compiler.psi.aprl

sealed interface LiteralConstant<T> : Token {
    val value: T
}
