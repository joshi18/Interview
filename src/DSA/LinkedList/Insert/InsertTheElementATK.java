package src.DSA.LinkedList.Insert;
class  Node7{
    int data;
    Node7 next;
    Node7 (int new_data){
        data = new_data;
        next = null;

    }
}
public class InsertTheElementATK {

    public static void main(String[] args) {

        Node7 head= new Node7(1);
        head.next = new Node7(2);
        head.next.next = new Node7(3);
        head.next.next.next = new Node7(4);
        head.next.next.next.next = new Node7(5);
        int new_data = 100;
        int k = 3;
        Node7 updatedHead =  insertelementATK(head,k,new_data);
        printLinkedList( updatedHead);

    }
    public static Node7 insertelementATK(Node7 head,int k,int new_data){
        Node7 temp = head;
        Node7 prev = null;
        Node7 newNode = new Node7(new_data);
        int count = 0;
        while (temp!= null){
            count+=1;
            if (count==k){
                prev.next = newNode;
                newNode.next = temp;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;



    }

    public static void printLinkedList(Node7 head){
        while (head!= null){
            System.out.println(head.data);
            head = head.next;
        }

    }
}
