package DSA.Recursion;

public class ReversdeLinkListcodeDuplicate {

    public static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }
    public static void main (String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        Node reversethead = reversetheLinkedList(head);
        printLinkedList(reversethead);

    }
    public static Node reversetheLinkedList(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node reverseHead = reversetheLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return  reverseHead;

    }

    public static void printLinkedList(Node curr){
        while(curr != null){
            System.out.println(curr.data);
             curr=curr.next;
        }
        System.out.println();

    }

}
