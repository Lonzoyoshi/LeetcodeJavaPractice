package Leetcode.SimpleQus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 杨辉三角
 * 动态规划参考
 */
public class Leetcode118 {
    private int numRows = 5;
    public List<List<Integer>> generate(int numRows) {
        Integer[][] dp = new Integer[numRows][];
        for (int i = 0; i < numRows; i++){
            dp[i] = new Integer[i+1];
            dp[i][0] = dp[i][i] = 1;
            for (int j = 1; j < i; j++){
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (Integer[] row : dp){
            result.add(Arrays.asList(row));
        }
        return result;
    }
    public void test(){
        System.out.println(generate(this.numRows).toString());
    }
    public static void main(String args[]){
        Leetcode118 lt = new Leetcode118();
        lt.test();
    }
}
