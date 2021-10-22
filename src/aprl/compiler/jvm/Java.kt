package aprl.compiler.jvm

interface Java {
    fun toJava(): String
}

class ConstructorFactory(val clazz: Clazz) : Java {
    
    val modifiers: MutableList<Modifier> = mutableListOf()
    val annotations: Annotations = mutableListOf()
    val parameters: MutableList<JavaParameter> = mutableListOf()
    val statements: MutableList<JavaStatement> = mutableListOf()
    
    override fun toJava(): String {
        val sb = StringBuilder()
        for (annotation in annotations) {
            sb.append("@" + annotation.first.name)
            if (annotation.second.isNotEmpty()) {
                sb.append("(" + annotation.second.joinToString(", ") { it.toJava() } + ")")
            }
        }
        sb.append(if (annotations.isNotEmpty()) "\n" else "")
        for (modifier in modifiers) {
            sb.append(modifier.toJava())
        }
        sb.append(clazz.name)
        sb.append("(" + parameters.joinToString(", ") { it.toJava() } + ") {")
        for (statement in statements) {
            sb.append(statement.toJava().prependIndent() + "\n")
        }
        sb.append("}")
        return sb.toString()
    }
    
}

abstract class JavaStatement : Java

class SuperCall(val valueArguments: ValueArguments) : JavaStatement() {
    
    override fun toJava(): String {
        val sb = StringBuilder()
        sb.append("super(")
        sb.append(valueArguments.joinToString(", ") { it.toJava() })
        sb.append(");")
        return sb.toString()
    }
    
}

class JavaParameter : Java {
    override fun toJava(): String {
        TODO("Not yet implemented")
    }
}
