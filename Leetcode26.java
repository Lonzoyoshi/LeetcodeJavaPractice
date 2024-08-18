package Leetcode.SimpleQus;

import java.util.Arrays;

/**
 * 删除有序数组中的重复项
 */
public class Leetcode26 {
    private int[] nums = {0,0,1,1,1,2,2,3,3,4};
    Leetcode26(){}
    public int removeDuplicates(int[] nums) {
        // 索引
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[index] != nums[i]){
                nums[++index] = nums[i];
            }
        }
        return index+1;
    }
    public void test(){
        System.out.println(removeDuplicates(this.nums));
        System.out.println(Arrays.toString(this.nums));
    }
    public static void main(String[] args){
        Leetcode26 lt = new Leetcode26();
        lt.test();
    }
}
