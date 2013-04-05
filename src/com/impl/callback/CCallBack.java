package com.impl.callback;

import com.fs.CallBack;
import java.util.ArrayList;
import java.util.List;

public class CCallBack {
    
    List<CallBack> cbs = new ArrayList<>();
    
    public void registerCallBack(CallBack f){
        cbs.add(f);
    }
    
    public void onAction(int i){
        for (CallBack callBack : cbs) {
            callBack.m(i);
        }
    }
}
