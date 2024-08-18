package Leetcode.Simple100;

public class Palindrome {
    private int x = 121;
    Palindrome(){};
    Palindrome(int x){
        this.x = x;
    }
    public void test(){
        System.out.println(isPalindrome(this.x));
    }
    public boolean isPalindrome(int x){
        // 1.判断是否小于0
        if (x < 0){
            return false;
        }
        // 获取比较次数
        String xstr = x + "";
        int i = xstr.length() / 2;

        for (int j = 0; j < i; j++){
            // 开始比较
            char v1 = xstr.charAt(j);
            char v2 = xstr.charAt(xstr.length()-1-j);
            if (v1 != v2){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Palindrome p1 = new Palindrome(10);
        p1.test();
    }
}
