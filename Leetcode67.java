package Leetcode.Simple100;

/**
 * 二进制求和
 */
public class Leetcode67 {
    private String a = "1010";
    private String b = "1011";

    public String addBinary(String a, String b) {
        StringBuffer ans = new StringBuffer();

        int n = Math.max(a.length(), b.length()), carry = 0;
        for (int i = 0; i < n; i++) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char)(carry % 2 + '0'));
            carry/=2;
        }
        if (carry>0){
            ans.append('1');
        }
        ans.reverse();
        return ans.toString();
    }
    public void test(){
        System.out.println(addBinary(this.a,this.b));
    }
    public static void main(String[] args){
        Leetcode67 lt = new Leetcode67();
        lt.test();
    }

}
