package Leetcode.SimpleQus;

import java.util.ArrayList;
import java.util.List;

/**
 * 三角形的最小路径和
 */
public class Leetcode120 {
    private List<List<Integer>> triangle = new ArrayList<>();
    Leetcode120(){
        List<Integer> a = new ArrayList<>();
        a.add(2);
        triangle.add(a);
        a.clear();
        a.add(3); a.add(4);
        triangle.add(a);
        a.clear(); a.add(6);
        a.add(5); a.add(7);
        triangle.add(a);
        a.clear();
        a.add(4); a.add(1); a.add(8); a.add(3);
        triangle.add(a);
        a.clear();
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] f = new int[n][n];
        f[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < n; ++i) {
            f[i][0] = f[i - 1][0] + triangle.get(i).get(0);
            for (int j = 1; j < i; ++j) {
                f[i][j] = Math.min(f[i - 1][j - 1], f[i - 1][j]) + triangle.get(i).get(j);
            }
            f[i][i] = f[i - 1][i - 1] + triangle.get(i).get(i);
        }
        int minTotal = f[n - 1][0];
        for (int i = 1; i < n; ++i) {
            minTotal = Math.min(minTotal, f[n - 1][i]);
        }
        return minTotal;
    }

    public void test(){
        System.out.println(minimumTotal(this.triangle));
    }
    public static void main(String[] args){
        Leetcode120 lt = new Leetcode120();
        lt.test();
    }
}
