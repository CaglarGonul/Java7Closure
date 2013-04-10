package basic;

import com.fs.CallBack;
import com.impl.callback.CCallBack;
import org.junit.Test;


public class CallBackTester {
    CCallBack cb = new CCallBack();
    
    @Test
    public void test_callback(){
 
        CallBack cb1 = new CallBack() {
            int x = 1;
            @Override
            public void m(int e) {
                if(e==1){
                    System.out.println("You register this callback " + x + " time/times");
                    x++;
                }
            }
        };
        
        cb.registerCallBack(cb1);
        cb.registerCallBack(cb1);
        cb.registerCallBack(cb1);
        cb.registerCallBack(cb1);
        cb.registerCallBack(cb1);
        cb.removeCallBack(cb1);
        
        cb.onAction(1);
    }
         
}