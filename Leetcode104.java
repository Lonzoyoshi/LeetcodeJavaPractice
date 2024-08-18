package Leetcode.SimpleQus;

/**
 * 二叉树的最大深度
 */
public class Leetcode104 {
    private TreeNode root = new TreeNode(3,
            new TreeNode(9),
            new TreeNode(20, new TreeNode(15), new TreeNode(7)));

    public int maxDepth(TreeNode root) {
        return recursivePart(root, 0);
    }

    public int recursivePart(TreeNode root, int n) {
        int max = n;
        if (root == null) return max;
        if (root != null)
            max = n + 1;
        int a = recursivePart(root.left, max);
        int b = recursivePart(root.right, max);
        max = a > b ? a : b;
        return max;
    }

    public int dfsMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = dfsMaxDepth(root.left);
            int rightHeight = dfsMaxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public void test() {
        System.out.println(maxDepth(this.root));
        System.out.println(dfsMaxDepth(this.root));
    }

    public static void main(String[] args) {
        Leetcode104 lt = new Leetcode104();
        lt.test();
    }
}
