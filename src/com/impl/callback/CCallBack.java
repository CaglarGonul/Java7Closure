package com.impl.callback;

import com.fs.CallBack;
import java.util.ArrayList;
import java.util.List;

public class CCallBack {
    
    List<CallBack> cbs = new ArrayList<>();
    
    public void registerCallBack(CallBack f){
        cbs.add(f);
    }
    
    public void removeCallBack(CallBack f){
        if(cbs.contains(f)){
            cbs.remove(f);
        }
    }
    
    public void onAction(int i){
        for (CallBack callBack : cbs) {
            callBack.m(i);
        }
    }
}
