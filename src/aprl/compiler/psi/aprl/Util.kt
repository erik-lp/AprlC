package aprl.compiler.psi.aprl

import aprl.compiler.error.ErrorCollector
import aprl.compiler.load.loadCompleteClass
import aprl.compiler.psi.Position
import sun.reflect.generics.factory.CoreReflectionFactory
import sun.reflect.generics.scope.ClassScope
import java.io.File
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

fun qualifiedNameToType(qualifiedName: Pair<Identifier, List<TypeProjection>?>): Type? {
    val clazz = loadCompleteClass(qualifiedName.first.toString())
    return clazz?.let {
        if (qualifiedName.second == null) {
            return clazz
        } else {
            val factory = CoreReflectionFactory.make(clazz, ClassScope.make(clazz))
            factory.makeParameterizedType(clazz, arrayOf(), clazz.enclosingClass)
        }
    }
}

val Type.annotations: Array<Annotation>
    get() {
        return when (this) {
            is Class<*> -> annotations
            is ParameterizedType -> rawType.annotations
            else -> arrayOf()
        }
    }
