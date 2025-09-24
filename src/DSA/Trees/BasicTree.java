package src.DSA.Trees;


import java.util.Stack;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int new_data){
        data = new_data;
        left = null;
        right = null;

    }
}
public class BasicTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right  = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);


        inOrderTraversal(root);
        preOederTraversal(root);
    }
    public static void inOrderTraversal(TreeNode root){

        Stack<TreeNode> treeNodeStack = new Stack<>();
        TreeNode current = root;
        while (current!= null || !treeNodeStack.empty()){

            while (current!= null){
                treeNodeStack.push(current);
                current = current.left;

            }
             current = treeNodeStack.pop();
            System.out.println(current.data);
            current = current.right;

        }

    }
    public static  void preOederTraversal(TreeNode root){
        TreeNode currentNode = root;
        while (currentNode!= null){

        }

    }


}
