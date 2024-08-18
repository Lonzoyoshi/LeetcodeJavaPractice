package Leetcode.SimpleQus;

/**
 * 整数反转
 */
public class Reverse {
    private int x = -123;
    public void test(){
        System.out.println(reverse(x));
    }
    Reverse(){

    }
    Reverse(int x){
        this.x = x;
    }

    public int reverse(int x) {
        String res = "";
        String xstr = x + "";
        String fs = "";
        // 1. 先判断是否为负数
        if (xstr.substring(0,1).equals("-")){
            fs = "-";
            xstr = xstr.substring(1);
        }

        // 2.进行整数反转
        for (int i = xstr.length() - 1; i >= 0; i--){
            res += xstr.charAt(i);
        }
        try {
            // 3.返回反转后的整数
            return Integer.parseInt(fs + res);
        }catch (Exception e){
            return 0;
        }
    }

    public static void main(String[] args){
        Reverse r1 = new Reverse();
        r1.test();
        Reverse r2 = new Reverse(299);
        r2.test();
        Reverse r3 = new Reverse(666);
        r3.test();
    }

}
