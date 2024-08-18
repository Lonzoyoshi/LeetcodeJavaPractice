package Leetcode.SimpleQus;

/**
 * 最大子数组和
 */
public class Leetcode53 {
    private int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    // 动态规划
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++){
            nums[i] += Math.max(nums[i-1],0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }
    public void test(){
        System.out.println(maxSubArray(this.nums));
    }
    public static void main(String[] args){
        Leetcode53 lt = new Leetcode53();
        lt.test();
    }
}
