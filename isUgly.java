package Leetcode.SimpleQus;

/**
 * 丑数 质因数{2,3,5}
 */
public class isUgly {
    private int n = 6;
    public boolean isUgly(int n){
        if (n <= 0){
            return false;
        }
        int [] factors = {2,3,5};
        for (int factor : factors){
            while (n % factor == 0){
                n /= factor;
            }
        }
        return n == 1;
    }
    public void test(){
        System.out.println(isUgly(this.n));
    }
    public static void main(String[] args){
        isUgly iu = new isUgly();
        iu.test();
    }


}
