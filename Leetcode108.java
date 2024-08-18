package Leetcode.SimpleQus;

import java.util.ArrayList;
import java.util.List;

/**
 * 将有序数组转换为二叉搜索树
 */
public class Leetcode108 {
    private int[] nums = {-10, -3, 0, 5, 9};

    public TreeNode sortedArrayToBST(int[] nums) {
        return recursive_Part(nums, 0, nums.length - 1);
    }

    public TreeNode recursive_Part(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = recursive_Part(nums, left, mid - 1);
        root.right = recursive_Part(nums, mid + 1, right);
        return root;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> PreorderList = new ArrayList<>();
        recursivePart(root, PreorderList);
        return PreorderList;
    }
    public void recursivePart(TreeNode root, List<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        recursivePart(root.left, list);
        recursivePart(root.right, list);
    }
    public void test(){
        System.out.println(preorderTraversal(sortedArrayToBST(this.nums)).toString());
    }
    public static void main(String[] args){
        Leetcode108 lt = new Leetcode108();
        lt.test();
    }
}
