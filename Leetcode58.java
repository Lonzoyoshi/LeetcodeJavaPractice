package Leetcode.Simple100;

/**
 * 最后一个单词的长度
 */
public class Leetcode58 {
    private String s = "luffy is still joyboy";
    public int lengthOfLastWord(String s) {
        int cnt = 0;
        for (int i = s.length()-1; i >= 0; i--){
            if (s.charAt(i) == ' ' && cnt != 0) break;
            if (s.charAt(i) != ' ') cnt++;
        }
        return cnt;
    }
    // 语法糖解法
    public int lengthOfLastWord2(String s){
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }

    public void test(){
        System.out.println(lengthOfLastWord(this.s));
        System.out.println(lengthOfLastWord2(this.s));
    }
    public static void main(String[] args){
        Leetcode58 lt = new Leetcode58();
        lt.test();
    }

}
