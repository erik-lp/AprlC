package aprl.lang

sealed interface Function

fun interface Function0<A> : Function {
    fun run(): A
}

fun interface Function1<A, B> : Function {
    fun run(a: A): B
}

fun interface Function2<A, B, C> : Function {
    fun run(a: A, b: B): C
}

fun interface Function3<A, B, C, D> : Function {
    fun run(a: A, b: B, c: C): D
}

fun interface Function4<A, B, C, D, E> : Function {
    fun run(a: A, b: B, c: C, d: D): E
}

fun interface Function5<A, B, C, D, E, F> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E): F
}

fun interface Function6<A, B, C, D, E, F, G> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F): G
}

fun interface Function7<A, B, C, D, E, F, G, H> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F, g: G): H
}

fun interface Function8<A, B, C, D, E, F, G, H, I> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H): I
}

fun interface Function9<A, B, C, D, E, F, G, H, I, J> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I): J
}
