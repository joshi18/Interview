package src.DSA.Trees.DFS.Recursion;

class TreenodePostOrder {

    int data;
    TreenodePostOrder left;
    TreenodePostOrder right;

    TreenodePostOrder(int new_Data) {
        data = new_Data;
        left = null;
        right = null;

    }

}

public class PostOrderTraversal {
    public static void main(String[] args) {

        TreenodePostOrder root = new TreenodePostOrder(1);
        root.left = new TreenodePostOrder(2);
        root.right = new TreenodePostOrder(3);
        root.left.left = new TreenodePostOrder(4);
        root.left.right = new TreenodePostOrder(5);
        root.right.left = new TreenodePostOrder(6);
        root.right.right = new TreenodePostOrder(7);
        // printPostOrderTraversal(root);
        printInoderTraversal(root);

    }

    public static void printPostOrderTraversal(TreenodePostOrder root) {

        if (root == null) return;


        printPostOrderTraversal(root.left);

        printPostOrderTraversal(root.right);
        System.out.println(root.data);


    }

    public static void printInoderTraversal(TreenodePostOrder root) {

        if (root == null) return;

        printInoderTraversal(root.left);
        System.out.println(root.data);
        printInoderTraversal(root.right);

    }
}
