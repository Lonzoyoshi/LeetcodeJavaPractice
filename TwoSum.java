package Leetcode.Simple100;

import java.util.Arrays;

/**
 * 两数之和
 */
public class TwoSum {
    private int [] nums;
    private int target;
    TwoSum(){
        super();
    }
    TwoSum(int[] nums, int target){
        this.nums = nums;
        this.target = target;
    }
    public void setNums(int[] nums){
        this.nums = nums;
    }
    public void setTarget(int target) {
        this.target = target;
    }

    public void test(){
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public int[] twoSum(int [] nums, int target){
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args){
        TwoSum n1 = new TwoSum(new int[]{2, 7, 11, 15},9);
        TwoSum n2 = new TwoSum(new int[]{4,6,7,8,9,2}, 11);
        n1.test();
        n2.test();
    }
}
