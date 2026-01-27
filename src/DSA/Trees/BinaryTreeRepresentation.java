package src.DSA.Trees;


class BinaryNode {
    int data;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(int key) {
        data = key;
        left = null;
        right = null;

    }

}

public class BinaryTreeRepresentation {
    public static void main(String[] args) {

        BinaryNode root = new BinaryNode(1);

        root.right = new BinaryNode(2);
        root.left = new BinaryNode(3);
        root.left.left = new BinaryNode(4);
        root.left.right = new BinaryNode(5);
        root.right.right = new BinaryNode(6);
        root.right.left = new BinaryNode(7);

    }
}
