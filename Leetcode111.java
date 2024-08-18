package Leetcode.SimpleQus;

/**
 * 二叉树的最小深度
 * 根节点到最近叶子结点
 */
public class Leetcode111 {
    private TreeNode root1 = new TreeNode(3,
            new TreeNode(9),
            new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    private TreeNode root2 = new TreeNode(2, null,
            new TreeNode(3, null,
                    new TreeNode(4, null,
                            new TreeNode(5, null, new TreeNode(6)))));

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int min_depth = Integer.MAX_VALUE;
        if (root.left != null) {
            min_depth = Math.min(minDepth(root.left), min_depth);
        }
        if (root.right != null) {
            min_depth = Math.min(minDepth(root.right), min_depth);
        }
        return min_depth + 1;
    }

    public void test() {
        System.out.println(minDepth(this.root1));
        System.out.println(minDepth(this.root2));
    }

    public static void main(String[] args) {
        Leetcode111 lt = new Leetcode111();
        lt.test();
    }

}
