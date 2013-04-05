package com.fs;

/**
 * This interface is responsible for holding the closures when it comes to map.
 * It uses two generic types. One for the argument and one for the return type.
 * @param <B> Generic type 
 * @param <A> Generic type
 */
public interface Func<B,A> {
    /**
     * Function prototype m takes an argument of type A and returns a type B.
     * A map operation can produce a different type.
     * @param x of type A
     * @return type B
     */
     B m(A x); 
}
