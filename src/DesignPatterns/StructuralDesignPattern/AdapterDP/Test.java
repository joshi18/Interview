package DesignPatterns.StructuralDesignPattern.AdapterDP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
         //PayPalGateWay payPalGateWay =new PayPalGateWay();
//         paymentProcessor payPalAdptor = new PayPalAdptor(new PayPalGateWay());
//         payPalAdptor.paytheAmmount();


        List<Integer> abc = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int  sum1 =abc.stream()
                .filter(x->x%2==0)
                .mapToInt(a->a).sum();
        System.out.println(sum1);


//        1010  => A,B,C;  Client table  => 1
//        A=> 1010,2020;    Events table  =>  1
//                consumer access control;
//                1 1  1 Active
//



    }
}
