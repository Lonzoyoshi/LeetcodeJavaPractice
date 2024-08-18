package Leetcode.Simple100;

/**
 * 最长回文子串
 */
public class Leetcode05 {
    private String s1 = "babad";
    private String s2 = "cbbd";

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        int maxLen = 1;
        int begin = 0;

        boolean[][] dp = new boolean[len][len];
        char[] charArray = s.toCharArray();
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }
    public void test(){
        System.out.println(longestPalindrome(this.s1));
        System.out.println(longestPalindrome(this.s2));
    }
    public static void main(String[] a){
        Leetcode05 lt = new Leetcode05();
        lt.test();
    }
}
