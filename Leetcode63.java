package Leetcode.SimpleQus;

/**
 * 不同路径Ⅱ
 */
public class Leetcode63 {
    private int[][] obstacleGrid1 = {
            {0,0,0},
            {0,1,0},
            {0,0,0}
    };
    private int[][] obstacleGrid2 = {
            {0,1},
            {0,0}
    };
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length, m = obstacleGrid[0].length;
        int f[] = new int[m];

        f[0] = obstacleGrid[0][0] == 0 ? 1:0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (obstacleGrid[i][j]==1){
                    f[j]=0;
                    continue;
                }
                if (j-1 >= 0 && obstacleGrid[i][j-1] == 0){
                    f[j] += f[j-1];
                }
            }
        }
        return f[m-1];
    }
    public void test(){
        System.out.println(uniquePathsWithObstacles(this.obstacleGrid1));
        System.out.println(uniquePathsWithObstacles(this.obstacleGrid2));
    }
    public static void main(String[] a){
        Leetcode63 lt = new Leetcode63();
        lt.test();
    }
}
