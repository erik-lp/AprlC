package aprl.compiler.verification

import aprl.compiler.Scope
import aprl.compiler.psi.aprl.FunctionDeclaration
import aprl.compiler.psi.aprl.Named
import java.lang.reflect.*

fun Type.getFunctionsByName(name: String, scope: Scope<Named>): List<Method> {
    return (when (this) {
        is Class<*> -> methods.filter { it.name == name }
        is GenericArrayType -> Array::class.java.getFunctionsByName(name, scope)
        is ParameterizedType -> listOf()
        is TypeVariable<*> -> listOf()
        is WildcardType -> listOf()
        else -> throw InternalError("Didn't expect java.lang.Type to be ${this::class.qualifiedName}")
    }) + scope.members.filterIsInstance<FunctionDeclaration>().map { it as Method /*TODO: getFunctionsByName(name, scope)*/ }
}
