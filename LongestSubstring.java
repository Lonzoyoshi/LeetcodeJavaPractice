package Leetcode.Simple100;

/**
 * 无重复字符的最长字串
 */
public class LongestSubstring {
    private String s = "abcabcbb";
    public int lengthOfLongestSubstring(String s) {
        int left = 0, length = 0, max = 0;
        for (int right=0; right < s.length(); right++){
            for (int k = left; k < right; k++){
                if (s.charAt(k) == s.charAt(right)){
                    left = k+1;
                    length = right - left;
                    break;
                }
            }
            length++;
            if (max < length) max = length;
        }
        return max;
    }
    public void test(){
        System.out.println(lengthOfLongestSubstring(this.s));
    }
    public static void main(String[] args){
        LongestSubstring ls1 = new LongestSubstring();
        ls1.test();
    }
}
