package List;

import java.util.ArrayList;
import java.util.Vector;

public class vector {

    public static void main( String args[]) {
        // Thread Safe and synchonized
        Vector<Integer> abc = new Vector<>(2, 3);
        System.out.println(abc.capacity());
        abc.add(1);
        abc.add(2);
        System.out.println(abc.capacity());
        abc.add(3);
        System.out.println(abc.capacity());


        Vector<Integer> abcd = new Vector<>();

        Thread t1 = new Thread(()-> {for(int i =0;i<300;i++){
            abcd.add(i);
        }});
        // instance
        Thread t2 = new Thread(()->{ for(int i =  0 ; i<300;i++){
            abcd.add(i);
        }});
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(abcd.size());






//        abc.clear();
//        System.out.println(abc);
    }
}
