package Leetcode.Simple100;

import java.util.Arrays;

/**
 * 路径总数
 */
public class Leetcode62 {
    private int m = 3, n = 7;
    Leetcode62(){}
    Leetcode62(int m, int n){
        this.m = m; this.n = n;
    }
    public int uniquePaths(int m, int n) {
        int [] cur = new int[n];
        // 语法糖
        Arrays.fill(cur,1);
        for (int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                cur[j] += cur[j-1];
            }
        }
        return cur[n-1];
        /**
         * 正常应该
         * int [m][n]
         * for (i -> m) f[i][0] = 1
         * for (j -> n) f[0][j] = 1
         * for (i=1 -> m)
         *      for(j=1 -> n)
         *          f[i][j] = f[i-1][j] + f[i][j-1]
         * return f[m-1][n-1]
         */
    }
    public void test(){
        System.out.println(uniquePaths(this.m,this.n));
    }
    public static void main(String[] a){
        Leetcode62 lt = new Leetcode62();
        Leetcode62 lt2 = new Leetcode62(4,6);
        lt.test();
        lt2.test();
    }

}
