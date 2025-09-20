package src.DSA.LinkedList.Delete;

  class  Node5{
    int data;
    Node5 next;
    Node5 (int new_data){
        data = new_data;
    }
}
public class DeleteTheLastNodeINLL {
    public static void main(String[] args) {


        Node5 head = new Node5(1);
        head.next = new Node5(2);
        head.next.next = new Node5(3);
        head.next.next.next = new Node5(4);

        Node5 updated = deleteTheLastNode(head);
        printTheLinkedList(updated);


    }
    public static Node5 deleteTheLastNode(Node5 head){
        Node5 temp = head;

        while (temp != null && temp.next.next != null){
            temp = temp.next;

        }
        temp.next = null;
        return head;

    }

    public static void printTheLinkedList(Node5 head){
        while (head!= null){
            System.out.println(head.data);
            head = head.next;
        }
    }


}
