package Leetcode.Simple100;

/**
 * 路径总和
 * 根节点到叶子节点的节点值之和(value) 是否等于目标targetSum
 */
public class Leetcode112 {
    private TreeNode root1 = new TreeNode(5,
            new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
            new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
    private int targetSum1 = 22;
    private TreeNode root2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    private int targetSum2 = 5;
    private TreeNode root3 = null;
    private int targetSum3 = 0;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        }
        if (root.left == null && root.right == null){
            return targetSum == root.val;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum-root.val);
    }

    public void test(){
        System.out.println(hasPathSum(root1,targetSum1));
        System.out.println(hasPathSum(root2,targetSum2));
        System.out.println(hasPathSum(root3,targetSum3));
    }
    public static void main(String[] args){
        Leetcode112 lt = new Leetcode112();
        lt.test();
    }
}

