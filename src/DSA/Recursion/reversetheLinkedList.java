package DSA.Recursion;



public class reversetheLinkedList {


    public static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }

    }

    public static void main(String args[]){

        // Creating hard coded linked list
        //1->2->3->4->5->null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5); // linked list formed.

         head = reversethelinkedlist(head);
         printlinkedList(head);


    }
    public static Node reversethelinkedlist(Node head ){// when head is 2 , then we are calling reveheadlist(
//3). then reverseehad(3) => 3 (output) (reversehead).
        // 2.next.next (3.next( null)) -> 2 (head)
        //2.next-> null; and return reversehead.
        if(head == null || head.next == null){
            return head;
        }
        Node reversehead = reversethelinkedlist(head.next);

        head.next.next = head;
        head.next = null;
        return reversehead;   //  At last reverse the head is 5 . Only .



    }
    public static void printlinkedList(Node curr){
        while (curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }


    }
}
