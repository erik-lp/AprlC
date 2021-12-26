package aprl.compiler.error

class ErrorCollector<T> where T : Throwable, T : Comparable<T> {
    
    private val errors: ArrayList<T> = arrayListOf()
    
    fun collect(t: T) : Boolean {
        return if (t !in errors) {
            errors.add(t)
        } else {
            false
        }
    }
    
    fun finish() {
        errors.sorted().forEach { println("\u001B[31m${it.message}\u001B[0m") }
    }
    
}