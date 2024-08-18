package Leetcode.SimpleQus;

/**
 * 平衡二叉树
 * 给定一个二叉树，判断是否是平衡二叉树
 */
public class Leetcode110 {
    private TreeNode root1 = new TreeNode(3,
            new TreeNode(9),
            new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    private TreeNode root2 = new TreeNode(1,
            new TreeNode(2, new TreeNode(3,
                    new TreeNode(4), new TreeNode(4)), new TreeNode(3)),
            new TreeNode(2));
    private TreeNode root = null;

    // 自顶向下法
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return Math.abs(height(root.left) - height(root.right)) <= 1
                    && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }

    // 自底向上法
    public boolean isBalancedDown(TreeNode root) {
        return heightDown(root) >= 0;
    }

    public int heightDown(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftheight = heightDown(root.left);
        int rightheight = heightDown(root.right);
        if (leftheight == -1 || rightheight == -1 || Math.abs(leftheight - rightheight) > 1) {
            return -1;
        } else {
            return Math.max(leftheight, rightheight) + 1;
        }

    }


    public void test() {
        System.out.println(isBalanced(this.root1));
        System.out.println(isBalanced(this.root2));
        System.out.println(isBalanced(this.root));
        System.out.println(isBalancedDown(this.root1));
        System.out.println(isBalancedDown(this.root2));
        System.out.println(isBalancedDown(this.root));
    }

    public static void main(String[] args) {
        Leetcode110 lt = new Leetcode110();
        lt.test();
    }
}
