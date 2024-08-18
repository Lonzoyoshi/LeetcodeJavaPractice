package Leetcode.Simple100;

/**
 * 最小路径和
 */
public class Leetcode64 {
    private int[][] grid = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
    };

    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                } else if (i == 0) {
                    grid[i][j] = grid[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    grid[i][j] = grid[i - 1][j] + grid[i][j];
                } else {
                    grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
                }
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }

    public void test() {
        System.out.println(minPathSum(this.grid));
    }

    public static void main(String[] a) {
        Leetcode64 lt = new Leetcode64();
        lt.test();
    }
}
