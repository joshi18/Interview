package DSA.LinkedList;


class Node4{
    int data;
    Node4 next;
    Node4(int new_data){
          data = new_data;
        next = null;
    }
}
public class DeleteMiddleElementINLL {

    public static void main(String[] args) {
        Node4 head = new Node4(1);
        head.next = new Node4(2);
        head.next.next = new Node4(3);
        head.next.next.next = new Node4(4);
        head.next.next.next.next = new Node4(5);
        Node4 deleteNode = deleteTheNode(head);
        printtheLinkList(deleteNode);
    }
    public static void printtheLinkList(Node4 noder){
        while (noder!= null){
            System.out.println(noder.data);
            noder = noder.next;
        }

    }
    public static Node4  deleteTheNode(Node4 head){
        int temp = 0;
        Node4 curr = head;
        while (curr!= null){
            temp+=1;
            curr = curr.next;
        }
        int n = temp/2;
        curr = head;
        while (curr!= null){
            n-=1;
            if (n==0){
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;

        }
        return head;

    }
}
