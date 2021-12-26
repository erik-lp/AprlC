package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

sealed interface Token {
    val position: Position
}
