package src.DSA.Trees.DFS.Recursion;


class Treenode {
    int data;
    Treenode left;
    Treenode right;

    Treenode(int new_data) {
        data = new_data;
        left = null;
        right = null;
    }

}

public class PreOrderTraversal {
    public static void main(String[] args) {

        Treenode root = new Treenode(1);

        root.left = new Treenode(2);
        root.right = new Treenode(3);
        root.left.left = new Treenode(4);
        root.left.right = new Treenode(5);
        root.right.left = new Treenode(6);
        root.right.right = new Treenode(7);
        printPreOrderTraversal(root);

    }

    public static void printPreOrderTraversal(Treenode root) {

        if (root == null) return;

        System.out.println(root.data);

        printPreOrderTraversal(root.left);
        printPreOrderTraversal(root.right);

    }
}
