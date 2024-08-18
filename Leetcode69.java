package Leetcode.Simple100;

/**
 * x的平方根
 */
public class Leetcode69 {
    int s;
    private int x = 8;
    // 自带袖珍计算器
    public int mySqrtCal(int x){
        if (x==0) return 0;
        int ans = (int) Math.exp(0.5 * Math.log(x));
        return (long) (ans+1) * (ans+1) <= x ? ans + 1 : ans;
    }
    // 二分
    public int mySqrtBinary(int x){
        int l = 0, r = x, ans = -1;
        while (l <= r){
            int mid = l + (r-l) / 2;
            if ((long) mid * mid <= x){
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
    // 牛顿迭代
    public int mySqrt(int x) {
        s = x;
        if (x==0) return 0;
        return ((int)(sqrt(x)));
    }
    public double sqrt(double x){
        double res = (x + s / x) / 2;
        if (res == x){
            return x;
        } else {
            return sqrt(res);
        }
    }
    public void test(){
        System.out.println(mySqrt(this.x));
        System.out.println(mySqrtBinary(this.x));
        System.out.println(mySqrtCal(this.x));
    }
    public static void main(String[] args){
        Leetcode69 lt = new Leetcode69();
        lt.test();
    }
}
