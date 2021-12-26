package aprl.compiler.psi.aprl

import java.io.File

class AprlFile(
    val file: File,
    val preamble: Preamble,
    val topLevelObjects: List<TopLevelObject>,
) : Token {
    override val position = 0 to 0
}
