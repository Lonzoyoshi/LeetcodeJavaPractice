package Leetcode.Simple100;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的中序遍历
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Leetcode94 {
    private TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> InorderList = new ArrayList<>();
        recursivePart(root, InorderList);
        return InorderList;
    }

    public void recursivePart(TreeNode root, List<Integer> list) {
        if (root == null) return;
        recursivePart(root.left, list);
        list.add(root.val);
        recursivePart(root.right, list);
    }

    public void test() {
        System.out.println(inorderTraversal(this.root).toString());
    }

    public static void main(String[] args) {
        Leetcode94 lt = new Leetcode94();
        lt.test();
    }


}
