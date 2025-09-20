package src.DSA.LinkedList.Insert;
class Node1{
    int data;
    Node1 next;
    Node1(int new_data){
        data = new_data;
        next = null;

    }
}
public class InsertAtFirst {

    public static void main(String[] args) {
        Node1 head= new Node1(1);
        head.next = new Node1(2);
        head.next.next = new Node1(3);
        head.next.next.next = new Node1(4);
        int new_dataq = 100;
       Node1 new_head   = insertTheElement(head,new_dataq);
        printTheLinkedlst(new_head);
    }
    public static void printTheLinkedlst(Node1 head){
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node1 insertTheElement(Node1 head,int data){

        Node1 temp = new Node1(data);
        temp.next = head;
        return  temp;

    }
}
