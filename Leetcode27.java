package Leetcode.SimpleQus;

import java.util.Arrays;

/**
 * 移除元素
 */
public class Leetcode27 {
    private int[] nums = {0,1,2,2,3,0,4,2};
    private int val = 2;
    public int removeElement(int[] nums, int val) {
        // 双指针
        int right = nums.length-1;
        for (int i = 0; i <= right; i++){
            if (nums[i] == val){
                swap(nums,i--,right--);
            }
        }
        return right+1;
    }
    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public void test(){
        System.out.println(removeElement(this.nums,this.val));
        System.out.println(Arrays.toString(this.nums));
    }
    public static void main(String[] args){
        Leetcode27 lt = new Leetcode27();
        lt.test();
    }
}
