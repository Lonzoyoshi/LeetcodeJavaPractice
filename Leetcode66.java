package Leetcode.Simple100;

import java.util.Arrays;

/**
 * 加一
 */
public class Leetcode66 {
    private int[] digits = {2,3,9,9};

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; --i) {
            // 给不为9的加一，其实只有1位，便是最后一个不为9的一位
            if (digits[i] != 9) {
                ++digits[i];
                // 若恰为最后一位，则加完1直接返回
                for (int j = i + 1; j < n; ++j){
                    digits[j] = 0;
                }
                return digits;
            }
        }
        // 当所有都为9，则会生成新数组，第一位为1
        int[] ans = new int[n+1];
        ans[0] = 1;
        return ans;
    }

    public void test() {
        System.out.println(Arrays.toString(plusOne(this.digits)));
    }

    public static void main(String[] args) {
        Leetcode66 lt = new Leetcode66();
        lt.test();
    }

}
