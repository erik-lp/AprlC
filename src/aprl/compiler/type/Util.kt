package aprl.compiler.type

import java.lang.reflect.Type
import kotlin.reflect.KClass

val Type.isPrimitive: Boolean
    get() = this is Class<*> && isPrimitive
