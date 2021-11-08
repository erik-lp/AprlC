package aprl.compiler

import aprl.compiler.jvm.Position
import org.antlr.v4.runtime.ParserRuleContext

class Error(file: String, pos: Position, message: String) : Exception("ERROR in $file (${pos.first},${pos.second}): $message")

@Suppress("FunctionName")
fun WARN(file: String, pos: Position, message: String) {
    System.err.println("\u001B[33mWARNING in $file (${pos.first},${pos.second}): $message\u001B[0m")
}

@Suppress("FunctionName")
fun WARN(file: String, element: ParserRuleContext, message: String) {
    WARN(file, element.position, message)
}
