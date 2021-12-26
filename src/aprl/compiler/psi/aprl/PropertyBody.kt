package aprl.compiler.psi.aprl

import aprl.compiler.psi.Position

class PropertyBody(
    override val position: Position,
    val getters: List<Getter>,
    val setters: List<Setter>,
) : Token
