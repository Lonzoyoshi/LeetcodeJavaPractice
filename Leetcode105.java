package Leetcode.SimpleQus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 从前序与中序遍历序列构造二叉树
 */
public class Leetcode105 {
    private int[] preorder = {3, 9, 20, 15, 7};
    private int[] inorder = {9, 3, 15, 20, 7};
    private Map<Integer, Integer> indexMap;

    public TreeNode myBuildTree(int[] preorder, int[] inorder,
                                int preorder_left, int preorder_right,
                                int inorder_left, int inorder_right) {
        if (preorder_left > preorder_right) {
            return null;
        }
        // 前序遍历第一个结点就是根节点
        int preorder_root = preorder_left;
        // 中序遍历中定位根节点
        int inorder_root = indexMap.get(preorder[preorder_root]);
        // 先把根节点建立
        TreeNode root = new TreeNode(preorder[preorder_root]);
        int size_left_subtree = inorder_root - inorder_left;

        root.left = myBuildTree(preorder, inorder,
                preorder_left + 1, preorder_left + size_left_subtree,
                inorder_left, inorder_root - 1);
        root.right = myBuildTree(preorder, inorder,
                preorder_left + size_left_subtree + 1, preorder_right,
                inorder_root + 1, inorder_right);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return myBuildTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }
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
    public void test(){
        System.out.println(inorderTraversal(buildTree(this.preorder,this.inorder)).toString());
    }
    public static void main(String[] ARGS){
        Leetcode105 lt = new Leetcode105();
        lt.test();
    }
}
