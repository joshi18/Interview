package src.DSA.LinkedList;


import DSA.Recursion.ReversdeLinkListcodeDuplicate;

import java.util.HashMap;
import java.util.Map;

class  Node1{
    int data;
    Node1 next;
    Node1(int new_data){
        data = new_data;
        next = null;
    }
}
public class DetectLoopInsideLinkedList {
    public static void main(String[] args) {

//        Node1 head= new Node1(1);
//        head.next = new Node1(2);
//        head.next.next = new Node1(3);
//        head.next.next.next = new Node1(4);
//        head.next.next.next.next  = head;


        Node1 head3 = new Node1(1);
        head3.next = new Node1(2);
        head3.next.next = new Node1(3);
        head3.next.next.next = new Node1(4);
        head3.next.next.next.next = head3.next; // loop back to node 2

        System.out.println(checkloop(head3));

    }
    public static boolean checkloop(Node1 head){
//        Node1 temp = head;
//        Map<Node1,Integer> abc = new HashMap<>();
//        while (temp != null){
//            if (abc.containsKey(temp)){
//                return true;
//
//            }
//            abc.put(temp, temp.data);
//            temp = temp.next;
//
//        }
        Node1 slow = head;
        Node1 fast = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;

    }

}

