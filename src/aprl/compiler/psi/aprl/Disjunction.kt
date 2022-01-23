package aprl.compiler.psi.aprl

import aprl.compiler.Scope
import aprl.compiler.classHierarchy
import aprl.compiler.error.*
import aprl.compiler.psi.Position
import aprl.compiler.psi.java.MethodDeclaration
import aprl.compiler.toPlainClass
import aprl.compiler.toPlainClassOrNull
import aprl.compiler.verification.getFunctionsByName
import aprl.compiler.verification.supers
import java.io.File
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

class Disjunction(
    override val errors: ErrorCollector<SyntaxError>,
    override val warnings: ErrorCollector<SyntaxWarning>,
    override val file: File,
    override val position: Position,
    val conjunctions: List<Conjunction>
) : Token {
    
    fun inferType(scope: Scope<Named>): Type? {
        var left = conjunctions[0].inferType() ?: return null
        for (right in conjunctions.drop(1)) {
            val rightType = right.inferType() ?: return null
            val functions = left.getFunctionsByName("or", scope)
            val bestMatch = (functions.filter {
                (it.parameters.size == 1 && (it.parameters.single().parameter.type supers (rightType))) ||
                (it.parameters.size == 2 && (it.parameters[1].parameter.type supers (rightType)))
            }).let { matching ->
                bestMatch(matching.map { it.parameters.last().parameter.type }, rightType)?.let { index -> matching.getOrNull(index) }
            }
            if (bestMatch == null) {
                ERROR("No function can be called with the arguments supplied")
            } else {
                left = bestMatch.returnType
            }
        }
        return left
    }
    
    private fun bestMatch(list: List<Type>, suppliedType: Type): Int? {
        if (list.isEmpty()) {
            return null
        }
        var bestMatch = list[0]
        var proximity = proximityInHierarchy(bestMatch, suppliedType)
        for (type in list) {
            require(type supers suppliedType) { "Closest match can only be found for inheriting types ($suppliedType does not extend $type)" }
            val currentProximity = proximityInHierarchy(type, suppliedType)
            if (currentProximity < proximity) {
                bestMatch = type
                proximity = currentProximity
            }
        }
        return list.indexOf(bestMatch)
    }
    
    private fun proximityInHierarchy(superType: Type, subType: Type): Int {
        require(superType supers subType) { "Hierarchy can only be analyzed for inheriting types ($subType does not extend $superType)" }
        val hierarchy: List<Class<*>> = subType.hierarchy ?: throw InternalError("Hierarchy can only be analyzed for Classes or ParameterizedTypes")
        val index = hierarchy.indexOf(superType.toPlainClassOrNull() ?: throw InternalError("Hierarchy can only be analyzed for Classes or ParameterizedTypes"))
        assert(index != -1) { "Super type does super sub type, but doesn't appear in sub type's class hierarchy" }
        return hierarchy.size - index - 1
    }
    
    private val Type.hierarchy: List<Class<*>>?
        get() = when (this) {
            is Class<*> -> classHierarchy
            is ParameterizedType -> (rawType as Class<*>).classHierarchy
            else -> null
        }
    
}
