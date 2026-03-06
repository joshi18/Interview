package src.DSA.Trees;


class TreeNodeL15 {
    int data;
    TreeNodeL15 left;
    TreeNodeL15 right;

    TreeNodeL15(int new_data) {
        data = new_data;
        left = null;
        right = null;

    }
}

public class L15CheckForBalancedBinaryTree {
    public static void main(String[] args) {

        TreeNodeL15 root = new TreeNodeL15(3);
        root.left = new TreeNodeL15(9);
        root.right = new TreeNodeL15(20);
        root.right.left = new TreeNodeL15(15);
        root.right.right = new TreeNodeL15(7);
        System.out.println(checkBalancedTree(root));

    }

    public static boolean checkBalancedTree(TreeNodeL15 root) {

        if (root == null) return true;

        int LH = findHeight(root.left);
        int RH = findHeight(root.right);

        if (Math.abs(RH - LH) > 1) return false;

        boolean left = checkBalancedTree(root.left);
        boolean right = checkBalancedTree(root.right);

        return left && right;

    }

    public static int findHeight(TreeNodeL15 root) {
        if (root == null) return 0;

        return 1 + Math.max(
                findHeight(root.left),
                findHeight(root.right)
        );
    }
}
