package List;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArraylistDemo {

    public static void main(String args[]){

        // when write operation occurs in the arrayList then new array is gets created with and previous pointer points to the new array.
        // "Copy on Write" means that whenever a write operation
        // like adding or removing an element
        // instead of directly modifying the existing list
        // a new copy of the list is created, and the modification is applied to that copy
        // This ensures that other threads reading the list while it’s being modified are unaffected.

        // Read Operations: Fast and direct, since they happen on a stable list without interference from modifications.
        // Write Operations: A new copy of the list is created for every modification.
        //                  The reference to the list is then updated so that subsequent reads use this new list.

        // notepad --> notepad-copy

        // read more
        CopyOnWriteArrayList<Integer> abc = new CopyOnWriteArrayList<>();
        abc.add(2);
        abc.add(3);
        ArrayList<Integer> khl = new ArrayList<>();
        khl.add(1);
        khl.add(2);
        khl.add(4);
        int n = khl.size();
        for(int i =0 ; i< n;i++){

            if (khl.get(i)== 4 ){
                 khl.set(i,90);

            }

        }
        System.out.println(khl);

    }
}
