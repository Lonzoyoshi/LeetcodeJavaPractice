package Leetcode.SimpleQus;

/**
 * 相同的树
 */

public class Leetcode100 {
    private TreeNode p = new TreeNode(1,new TreeNode(2),new TreeNode(1));
    private TreeNode q = new TreeNode(1,new TreeNode(2),new TreeNode(1));
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return recursiveJudge(p,q);
    }
    public boolean recursiveJudge(TreeNode p, TreeNode q){
        if (p == null && q == null) return true;
        else if (p!=null && q == null || p==null && q!=null) return false;
        if (p.val != q.val) return false;
        if (!recursiveJudge(p.left, q.left)) return false;
        if (!recursiveJudge(p.right, q.right)) return false;
        return true;
    }
    public void test(){
        System.out.println(isSameTree(this.p,this.q));
    }
    public static void main(String[] args){
        Leetcode100 lt = new Leetcode100();
        lt.test();
    }
}
