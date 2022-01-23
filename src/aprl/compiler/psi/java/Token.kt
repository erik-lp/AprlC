package aprl.compiler.psi.java

import aprl.compiler.psi.Position

sealed interface Token {
    val position: Position
}