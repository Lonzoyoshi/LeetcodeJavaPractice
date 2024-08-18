package Leetcode.Simple100;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 对角线遍历
 */
public class Leetcode498 {
    private int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m * n];
        int pos = 0;
        for (int i = 0; i < m + n - 1; i++) {
            if (i % 2 == 1) {
                int x = i < n ? 0 : i - n + 1;
                int y = i < n ? i : n - 1;
                while (x < m && y >= 0) {
                    res[pos] = mat[x][y];
                    pos++;
                    x++;
                    y--;
                }
            } else {
                int x = i < m ? i : m - 1;
                int y = i < m ? 0 : i - m + 1;
                while (x >= 0 && y < n) {
                    res[pos] = mat[x][y];
                    pos++;
                    x--;
                    y++;
                }
            }
        }
        return res;
    }

    public void test() {
        System.out.println(Arrays.toString(findDiagonalOrder(this.mat)));
    }

    public static void main(String[] A) {
        Leetcode498 lt = new Leetcode498();
        lt.test();
    }
}
