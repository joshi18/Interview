package src.DSA.LinkedList;

class Node2 {
    int data;
    Node2 next ;
    Node2(int new_data){
        data = new_data;
        next = null;
    }
}

public class CountTheNumberOfElementsInLoop {

    public static void main(String[] args) {
        Node2 head3 = new Node2(1);
        head3.next = new Node2(2);
        head3.next.next = new Node2(3);
        head3.next.next.next = new Node2(4);
        head3.next.next.next.next = head3.next; // loop back to node 2
        counttheNumbersIntheLoop(head3);
    }
    public static void counttheNumbersIntheLoop(Node2 head){
        Node2  slow = head;
        Node2 fast = head;
        while(fast!= null && fast.next != null){
            fast= fast.next.next;
            slow = slow.next;
            if (fast==slow){
                System.out.println(countTheNubers(fast,slow));
                return;
            }
        }
        System.out.println(0);



    }
    public static int countTheNubers(Node2 fast,Node2 slow){
        int count =1;
        fast = fast.next;
        while (fast!=slow){
            count+=1;
            fast = fast.next;


        }
        return  count;


    }

}
