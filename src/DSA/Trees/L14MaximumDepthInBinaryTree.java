package src.DSA.Trees;


class TreeNodeL14 {

    int data;
    TreeNodeL14 left;
    TreeNodeL14 right;

    TreeNodeL14(int new_data) {
        data = new_data;
        left = null;
        right = null;

    }

}

public class L14MaximumDepthInBinaryTree {


    public static void main(String[] args) {

        TreeNodeL14 root = new TreeNodeL14(1);
        root.left = new TreeNodeL14(2);
        root.right = new TreeNodeL14(3);
        root.right.left = new TreeNodeL14(4);
        root.right.left.left = new TreeNodeL14(5);
        root.right.right = new TreeNodeL14(6);
        System.out.println(checkDepth(root, 0));

    }

    public static int checkDepth(TreeNodeL14 root, int count) {

        if (root == null) return count;

        int left = checkDepth(root.left, count + 1);

        int right = checkDepth(root.right, count + 1);

        return Math.max(left, right);


    }

}
