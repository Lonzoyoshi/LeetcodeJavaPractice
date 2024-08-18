package Leetcode.Simple100;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的所有路径
 */
public class Leetcode257 {
    private TreeNode root = new TreeNode(1,
            new TreeNode(2, null, new TreeNode(5)),
            new TreeNode(3));
    private List<String> res = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root,"",res);
        return res;
    }

    private void dfs(TreeNode root, String path, List<String> res) {
        if (root == null) return;
        if (root.left == null && root.right == null){
            res.add(path+root.val);
            return;
        }
        dfs(root.left,path+root.val + "->",res);
        dfs(root.right,path+root.val + "->",res);
    }

    public void test(){
        System.out.println(binaryTreePaths(this.root));
    }
    public static void main(String[] args){
        Leetcode257 lt = new Leetcode257();
        lt.test();
    }

}
