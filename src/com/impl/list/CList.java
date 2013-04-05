package com.impl.list;

import com.fs.*;
import java.util.Stack;

public class CList<T> {
    T head;
    CList<T> tail;
    
    public CList(T x, CList<T> xs){
        head = x;
        tail = xs;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        CList<T> xs = this;
        while(xs != null){
            sb.append(xs.head.toString()).append(" ");
            xs=xs.tail;
        }
        return sb.toString();
    }
    
    static <A,B> CList<B> map(Func<B,A> f, CList<A> xs){
        if(xs==null){
            return null;
        }
        return new CList<>(f.m(xs.head),map(f,xs.tail));
    }
    
    static <A,B> CList<B> maploop(Func<B,A> f, CList<A> xs){
        Stack<CList<A>> stack = new Stack<>();
        while(xs != null){
            stack.push(xs);
            xs = xs.tail;
        }
        CList<B> result = null;
        while(!stack.empty()){
            xs = stack.pop();
            result = new CList<>(f.m(xs.head),result);
        }
        return result;
    }
    
    static <A> CList<A> filter(Pred<A> f, CList<A> xs){
        if(xs == null){
            return null;
        }
        if(f.m(xs.head)){
            return new CList<>(xs.head, filter(f,xs.tail));
        }
        return filter(f,xs.tail);
    }
    
    static <A> int length(CList<A> xs){
        int ans =0;
        while(xs!= null){
            ++ans;
            xs=xs.tail;
        }
        return ans;
    }
}
