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

fun interface Function10<A, B, C, D, E, F, G, H, I, J, K> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J): K
}

fun interface Function11<A, B, C, D, E, F, G, H, I, J, K, L> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K): L
}

fun interface Function12<A, B, C, D, E, F, G, H, I, J, K, L, M> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L): M
}

fun interface Function13<A, B, C, D, E, F, G, H, I, J, K, L, M, N> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M): N
}

fun interface Function14<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N): O
}

fun interface Function15<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O): P
}

fun interface Function16<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P): Q
}

fun interface Function17<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q): R
}

fun interface Function18<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R): S
}

fun interface Function19<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S): T
}

fun interface Function20<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T): U
}

fun interface Function21<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U): V
}

fun interface Function22<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U, v: V): W
}

fun interface Function23<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U, v: V, w: W): X
}

fun interface Function24<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U, v: V, w: W, x: X): Y
}

fun interface Function25<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> : Function {
    fun run(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U, v: V, w: W, x: X, y: Y): Z
}
