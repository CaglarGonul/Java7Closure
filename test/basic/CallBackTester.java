package basic;

import com.fs.CallBack;
import com.impl.callback.CCallBack;
import org.junit.Test;


public class CallBackTester {
    CCallBack cb = new CCallBack();
    
    @Test
    public void test_callback(){
        //Add callback for pressing 1 
        CallBack cb1 = new CallBack() {
            @Override
            public void m(int e) {
                if(e==1){
                    System.out.println("You pressed 1.");
                }
            }
        };
        cb.registerCallBack(cb1);
        //Add callback for pressing 2
        CallBack cb2 = new CallBack() {
            @Override
            public void m(int e) {
                if(e==2){
                    System.out.println("You pressed 2.");
                }
            }
        };
        cb.registerCallBack(cb2);
        //Add callback for pressing 3 
        CallBack cb3 = new CallBack() {
            @Override
            public void m(int e) {
                if(e==3){
                    System.out.println("You pressed 3.");
                }
            }
        };
        cb.registerCallBack(cb3);
        //Add callback for pressing 3 again
        cb.registerCallBack(cb3);
        //Lets press 3
        cb.onAction(3);
    }
         
}