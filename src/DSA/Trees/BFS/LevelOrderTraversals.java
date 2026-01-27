package src.DSA.Trees.BFS;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class levelOrderTree {
    int data;
    levelOrderTree left;
    levelOrderTree right;

    levelOrderTree(int new_data) {
        data = new_data;
        left = null;
        right = null;

    }
}

public class LevelOrderTraversals {
    public static void main(String[] args) {

        levelOrderTree root = new levelOrderTree(1);
        root.left = new levelOrderTree(2);
        root.right = new levelOrderTree(3);
        root.left.left = new levelOrderTree(4);
        root.left.right = new levelOrderTree(5);
        root.right.left = new levelOrderTree(6);
        root.right.right = new levelOrderTree(7);
        System.out.println(printLevelOrderTraversals(root));

    }

    public static List<List<Integer>> printLevelOrderTraversals(levelOrderTree root) {

        List<List<Integer>> wrapList = new ArrayList<>(); // wrap list to add the list of specific integers (List of paticular level).
        Queue<levelOrderTree> queue = new LinkedList<>(); // Queue to add the specific elements in the array

        if (root == null) return wrapList;
        queue.add(root);

        while (queue.size() != 0) {
            int levelNum = queue.size();
            List<Integer> subList = new ArrayList<>();
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().data);
            }
            wrapList.add(subList);
        }
        return wrapList;


    }
}
