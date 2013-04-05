package basic;


import com.impl.list.CList;
import com.impl.list.CListClient;
import org.junit.Test;


public class ListTester {
    
    CList<Integer> intlist_1 = new CList<>(new Integer(1),null);
    CList<Integer> intlist_2 = new CList<>(new Integer(2),intlist_1);
    CList<Integer> intlist_3 = new CList<>(new Integer(3),intlist_2);
    CList<Integer> intlist_4 = new CList<>(new Integer(4),intlist_3);
    CList<Integer> intlist_5 = new CList<>(new Integer(4),intlist_4);
    CList<Integer> intlist = new CList<>(new Integer(5),intlist_5);
            
    @Test
    public void test_doubleAll(){
        CList<Integer> doubled = CListClient.doubleAll(intlist);
        System.out.println("doubled : " + doubled.toString());
        CList<Integer> doubledloop = CListClient.doubleAllloop(intlist);
        System.out.println("doubledloop : " + doubledloop.toString());
    }
    
    @Test
    public void test_CountNs(){
        int count3s = CListClient.countNs(intlist, 3);
        System.out.println("count3s : " + count3s);
    }
}