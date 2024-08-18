package Leetcode.Simple100;

/**
 * 对称二叉树
 */
public class Leetcode101 {
    private TreeNode root1 = new TreeNode(1,
            new TreeNode(2, new TreeNode(3), new TreeNode(4)),
            new TreeNode(2, new TreeNode(4), new TreeNode(3)));
    private TreeNode root2 = new TreeNode(1,
            new TreeNode(2, null, new TreeNode(3)),
            new TreeNode(2, null, new TreeNode(3)));

    public boolean isSymmetric(TreeNode root) {
        return recursivePart(root,root);
    }
    public boolean recursivePart(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && recursivePart(p.left, q.right) && recursivePart(p.right, q.left);
    }
    public void test(){
        System.out.println(isSymmetric(this.root1));
        System.out.println(isSymmetric(this.root2));
    }
    public static void main(String[] Args){
        Leetcode101 lt = new Leetcode101();
        lt.test();
    }
}
