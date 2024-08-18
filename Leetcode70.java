package Leetcode.SimpleQus;

/**
 * 爬楼梯
 */
public class Leetcode70 {
    private int n = 5;
    public int climbStairs(int n) {
        int a = 1, b = 1, sum;
        for (int i = 0; i < n-1; i++){
            sum = a+b;
            a = b;
            b = sum;
        }
        return b;
    }
    public void test(){
        System.out.println(climbStairs(this.n));
    }
    public static void main(String[] args){
        Leetcode70 lt = new Leetcode70();
        lt.test();
    }

}
