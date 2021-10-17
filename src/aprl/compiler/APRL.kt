package aprl.compiler

import aprl.AprlLexer
import aprl.AprlParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.File
import java.nio.charset.Charset
import java.nio.file.Paths

fun main(args: Array<String>) {
    try {
        aprlc(args)
    } catch (ex: aprl.compiler.Error) {
        println("\u001B[31m${ex.message}\u001B[0m\n")
    }
}

private fun aprlc(args: Array<String>) {
    val cmdParser = AprlCmdParser(args)
    val target = cmdParser.targetDir
    for (sourceFile in cmdParser.sourceFiles) {
        compile(sourceFile, target.safe { File(this) })
    }
}

private fun compile(input: File, targetDir: File?) {
    val charStream = CharStreams.fromPath(Paths.get(input.path), Charset.defaultCharset())
    val lexer = AprlLexer(charStream)
    val tokenStream = CommonTokenStream(lexer)
    tokenStream.fill()
    val parser = AprlParser(tokenStream)
    val tree = parser.aprlFile()
    val listener = AprlListener(input.path, targetDir)
    ParseTreeWalker().walk(listener, tree)
    listener.compile()
}

fun <A, B> A?.safe(b: A.() -> (B)): B? {
    return if (this != null) b(this) else null
}
