package src.DSA.LinkedList.Insert;


class Node6{
    int data;
    Node6 next;
    Node6(int new_data){
        data = new_data;
        next = null;

    }
}
public class InsertATLast {
    public static void main(String[] args) {


        Node6 head= new Node6(1);
        head.next = new Node6(2);
        head.next.next = new Node6(3);
        head.next.next.next = new Node6(4);
        head.next.next.next.next = new Node6(5);
        int new_data = 100;
        Node6 qwe = indertElementAtLast(head, new_data);
        printtheLinkedList(qwe);

    }
    public static Node6 indertElementAtLast(Node6 head,int data){
        Node6 temp = head;
        while (temp.next!= null){
            temp= temp.next;
        }
        Node6 new_node = new Node6(data);
        temp.next = new_node;
        new_node.next = null;

        return  head;



    }

    public static void printtheLinkedList(Node6 head){
        while (head!= null){
            System.out.println(head.data);
            head = head.next;
        }

    }
}
