package aprl.compiler.error

import aprl.compiler.psi.Position
import java.io.File

class TypeInferenceError(
    val file: File,
    val position: Position,
) : Error("${file.path}:${position.first}:${position.second}: Type inference failed")
