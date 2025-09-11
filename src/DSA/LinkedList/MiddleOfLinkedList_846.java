package DSA.LinkedList;

public class MiddleOfLinkedList_846 {


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode middleNode(ListNode head) {
            int count = 0;
            ListNode temp = head;
            while (temp != null) {
                count += 1;
                temp = temp.next;

            }
            int elementtoFind = 0;
            if (count % 2 == 0) {
                elementtoFind = count / 2;
            }
            if (count % 2 != 0) {
                elementtoFind = count / 2;
            }
            while (elementtoFind != 0) {
                head = head.next;
                elementtoFind -= 1;

            }
            return head;
        }
    }
}
