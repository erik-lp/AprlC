package aprl.compiler.jvm

import aprl.compiler.safe
import java.lang.reflect.Field
import java.lang.reflect.Method

class Namespace {
    
    private val identifiers = ArrayList<String>()
    private var frozen = false
    
    fun add(identifier: String) {
        if (!frozen) {
            identifiers.add(identifier)
        }
    }
    
    fun addAll(identifiers: Collection<String>) {
        if (!frozen) {
            this.identifiers.addAll(identifiers)
        }
    }
    
    fun freeze() {
        frozen = true
    }
    
    fun toJava() = identifiers.joinToString(".")
    
}

class Import {
    var clazz: Class<*>? = null
    var pkg: Package? = null
    var method: Method? = null
    var field: Field? = null
    var alias: String? = null
    
    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if (other !is Import) {
            return false
        }
        return other.clazz == this.clazz && other.pkg == this.pkg && other.method == this.method && other.field == this.field && other.alias == this.alias
    }
    
    override fun hashCode(): Int {
        var result = clazz?.hashCode() ?: 0
        result = 31 * result + (pkg?.hashCode() ?: 0) + 1
        result = 31 * result + (method?.hashCode() ?: 0) + 2
        result = 31 * result + (field?.hashCode() ?: 0) + 3
        result = 31 * result + (alias?.hashCode() ?: 0) + 4
        return result
    }
}
