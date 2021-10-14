package aprl.compiler

class Error(file: String, pos: Pair<Int, Int>, message: String) : Exception("ERROR in $file (${pos.first},${pos.second}): $message")

@Suppress("FunctionName")
fun WARN(file: String, pos: Pair<Int, Int>, message: String) {
    System.err.println("\u001B[33mWARNING in $file (${pos.first},${pos.second}): $message\u001B[0m")
}
