package src.DSA.Trees.DFS.STACK;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeTraversalUsingStackNode {
    int data;
    TreeTraversalUsingStackNode left;
    TreeTraversalUsingStackNode right;

    TreeTraversalUsingStackNode(int new_data) {
        data = new_data;
        left = null;
        right = null;

    }
}

public class PreOrderTravesalUsingStack {
    public static void main(String[] args) {

        TreeTraversalUsingStackNode root = new TreeTraversalUsingStackNode(1);

        root.left = new TreeTraversalUsingStackNode(2);
        root.right = new TreeTraversalUsingStackNode(3);
        root.left.left = new TreeTraversalUsingStackNode(4);
        root.left.right = new TreeTraversalUsingStackNode(5);
        root.right.left = new TreeTraversalUsingStackNode(6);
        root.right.right = new TreeTraversalUsingStackNode(7);

        // System.out.println(printPreOderUsingStack(root));
        //System.out.println(printPostOrderUsingStack(root));
        System.out.println(printThePostOrderlelementsUsingOneStack(root));

    }

    public static List<Integer> printPreOderUsingStack(TreeTraversalUsingStackNode root) {

        List<Integer> wrapList = new ArrayList<>();
        Stack<TreeTraversalUsingStackNode> stack1 = new Stack<>();


        stack1.push(root);
        while (!stack1.isEmpty()) {
            root = stack1.pop();
            wrapList.add(root.data);
            if (root.right != null) {
                stack1.push(root.right);
            }
            if (root.left != null) {
                stack1.push(root.left);
            }
        }
        return wrapList;

    }

    public static List<Integer> printPostOrderUsingStack(TreeTraversalUsingStackNode root) {

        // this we are doing using 2 stacks .
        List<Integer> wrapList = new ArrayList<>();
        Stack<TreeTraversalUsingStackNode> stack1 = new Stack<>();
        Stack<TreeTraversalUsingStackNode> stack2 = new Stack<>();

        stack1.push(root);
        while (!stack1.isEmpty()) {
            root = stack1.pop();
            stack2.push(root);
            if (root.left != null) stack1.push(root.left);
            if (root.right != null) stack1.push(root.right);
        }

        while (!stack2.isEmpty()) {
            wrapList.add(stack2.pop().data);
        }
        return wrapList;

    }

    public static List<Integer> printThePostOrderlelementsUsingOneStack(TreeTraversalUsingStackNode root) {


        List<Integer> wrapList = new ArrayList<>();
        if (root == null) return wrapList;
        Stack<TreeTraversalUsingStackNode> stack = new Stack<>();
        TreeTraversalUsingStackNode current = root;
        TreeTraversalUsingStackNode lastvistedNode = null;
        while (current != null || !stack.empty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeTraversalUsingStackNode peekNode = stack.peek();
                if (peekNode.right != null && lastvistedNode != peekNode.right) {
                    current = peekNode.right;
                } else {
                    wrapList.add(peekNode.data);
                    lastvistedNode = stack.pop();
                }
            }
        }
        return wrapList;


    }
}
