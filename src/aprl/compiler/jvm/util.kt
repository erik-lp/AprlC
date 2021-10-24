package aprl.compiler.jvm

typealias Annotations = MutableList<Triple<Class<*>, ValueArguments, AnnotationRetention>>

@JvmName("annotationsToJava()")
fun Annotations.toJava(): String {
    val sb = StringBuilder()
    filter { it.third != AnnotationRetention.SOURCE }.forEach {
        sb.append("@" + it.first.name)
        if (it.second.isNotEmpty()) {
            sb.append("(" + it.second.joinToString(", ") { value -> value.toJava() } + ")")
        }
        sb.append("\n")
    }
    return sb.toString()
}

typealias ValueArguments = MutableList<ValueArgument>

@JvmName("valueArgumentsToJava()")
fun ValueArguments.toJava(): String {
    return joinToString(", ") { it.toJava() }
}

typealias Statements = MutableList<Statement>

@JvmName("statementsToJava()")
fun Statements.toJava(): String {
    return joinToString("") { it.toJava() + ";\n" }
}

fun Pair<Class<*>, TypeArgument?>.toJava(): String {
    val sb = StringBuilder()
    sb.append(first.name)
    if (second != null) {
        sb.append("<${second!!.toJava()}>")
    }
    return sb.toString()
}
