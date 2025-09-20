package src.Miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
                        //|
// If 10->20->30-> 40->50->60->70->80->90->100

//10+30+50+70+90 + 1+3+5+ 6+8+10 =  283
                                    //|
// 50 -> 1,2,3,4,5
// 80 -> 6,7,8,9,10,11

//Sum Nodes at Odd and Even Levels in a Multi-Directional Linked List


// John deer interview Question.


class Node{
    int data;
    Node up;
    Node down;
    Node next;
    Node(int new_data){
        data = new_data;
        up = null;
        down = null;
        next = null;
    }

}

public class Simple{

    public static void main(String[] args) {

//        List<Integer> arr = Arrays.asList(0,1,0,1);
//        CompletableFuture<Integer> abc = new CompletableFuture<>();



        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.up = new Node(1);
        head.next.next.next.next.up.up = new Node(2);
        head.next.next.next.next.up.up.up = new Node(3);
        head.next.next.next.next.up.up.up.up = new Node(4);
        head.next.next.next.next.up.up.up.up.up = new Node(5);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        head.next.next.next.next.next.next.next = new Node(80);
        head.next.next.next.next.next.next.next.down = new Node(6);
        head.next.next.next.next.next.next.next.down.down = new Node(7);
        head.next.next.next.next.next.next.next.down.down.down = new Node(8);
        head.next.next.next.next.next.next.next.down.down.down.down = new Node(9);
        head.next.next.next.next.next.next.next.down.down.down.down.down = new Node(10);
        head.next.next.next.next.next.next.next.down.down.down.down.down.down = new Node(11);
        head.next.next.next.next.next.next.next.next = new Node(90);
        head.next.next.next.next.next.next.next.next.next = new Node(100);


        sumOfOddAndEvenNodes(head);













    }

    public static void  sumOfOddAndEvenNodes(Node head){
        int i = 0;
        int sumOfEvenNodes = 0;
        int sumOfOddNodes = 0;
        while (head != null){
            if (i%2==0){
                sumOfEvenNodes+=head.data;
            }
            else {
                sumOfOddNodes += head.data;
            }
            if (head != null){
                int k = 0;
                Node temp = head.up;
                while (temp != null){
                    if (k%2==0){
                        sumOfEvenNodes+= temp.data;
                    }
                    else {
                        sumOfOddNodes += temp.data;
                    }
                    k+=1;
                    temp = temp.up;

                }

            }
            if (head != null){
                int l = 0;
                Node temp = head.down;
                while (temp!= null){
                    if (l%2 == 0){
                        sumOfEvenNodes += temp.data;
                    }
                    else {
                        sumOfOddNodes += temp.data;
                    }
                    l+=1;
                    temp = temp.down;
                }
            }
            i+=1;
            head = head.next;

        }
        System.out.println(sumOfEvenNodes);
        System.out.println(sumOfOddNodes);
    }
}
