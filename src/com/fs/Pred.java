package com.fs;


/**
 * This interface is responsible for holding the closures when it comes to filter.
 * @param <A> Generic type 
 */
public interface Pred<A> {
    /**
     * Function prototype m takes an argument of type A and returns a boolean.
     * A filter operation checks every element if it fits a predicate.
     * @param x of type A
     * @return boolean
     */
    boolean m(A x);
}
