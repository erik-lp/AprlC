package aprl.compiler

class Scope<T>(val members: List<T> = listOf()) {
    
    inline fun <reified S> constraint(): Scope<S> {
        return Scope(members.filterIsInstance<S>())
    }
    
}
