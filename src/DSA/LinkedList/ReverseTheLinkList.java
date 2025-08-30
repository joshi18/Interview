package DSA.LinkedList;


class  Node{
    int data;
    Node next;
    Node(int new_data){
        data = new_data;
        next = null;
        
    }
}
public class ReverseTheLinkList {
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node reverseHead = reversetheLinklist(head);
        printtheLinkList(reverseHead);


    }
    public static void printtheLinkList(Node reverseHead){
        while(reverseHead != null){
            System.out.println(reverseHead.data);
            reverseHead = reverseHead.next;
        }

    }

    public static Node reversetheLinklist(Node head){
        if (head == null ){
            return head;
        }
        if (head.next == null ){
            return head;
        }
        Node curr = head;
        Node prev = null;
        while(curr != null){

           Node temp =  curr.next;
           curr.next = prev; // null // Means breaking the linked list
            prev = curr;
            curr=  temp;

        }
        return prev;


    }
}
