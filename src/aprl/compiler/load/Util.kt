package aprl.compiler.load

fun loadTopLevelClass(identifier: String): Class<*>? {
    return try {
        Class.forName(identifier)
    } catch (ex: ClassNotFoundException) {
        null
    }
}

fun loadCompleteClass(fullIdentifier: String): Class<*>? {
    return loadCompleteClass(fullIdentifier.split(".").toMutableList(), mutableListOf())
}

private fun loadCompleteClass(identifiers: MutableList<String>, subIdentifiers: MutableList<String>): Class<*>? {
    if (identifiers.isEmpty()) {
        return null
    }
    val subIdentifierString = if (subIdentifiers.isEmpty()) "" else "$" + subIdentifiers.reversed().joinToString("$")
    val string = identifiers.joinToString(".") + subIdentifierString
    val last = identifiers.removeAt(identifiers.lastIndex)
    return loadTopLevelClass(string) ?: loadCompleteClass(identifiers, (subIdentifiers + last).toMutableList())
}
