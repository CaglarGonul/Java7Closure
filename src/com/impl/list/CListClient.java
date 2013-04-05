package com.impl.list;

import com.fs.Func;
import com.fs.Pred;

public class CListClient {
    public static CList<Integer> doubleAll(CList<Integer> xs){
        Func<Integer, Integer> df = new Func<Integer, Integer>() {
            @Override
            public Integer m(Integer x) {
                return x * 2;
            }
        };
        
        return CList.map(df, xs);
    }
    
    public static int countNs(CList<Integer> xs,final int n){
        Pred<Integer> pf = new Pred<Integer>() {
            @Override
            public boolean m(Integer x) {
                return x==n;
            }
        };
        return CList.length(CList.filter(pf, xs));
    }
    
    public static CList<Integer> doubleAllloop(CList<Integer> xs){
        Func<Integer, Integer> df = new Func<Integer, Integer>() {
            @Override
            public Integer m(Integer x) {
                return x * 2;
            }
        };
        
        return CList.maploop(df, xs);
    }
}
