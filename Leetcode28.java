package Leetcode.Simple100;

/**
 * 实现strStr()
 */
public class Leetcode28 {
    private String haystack = "hello";
    private String needle = "ll";
    Leetcode28(){}
    public int strStr(String haystack, String needle){
        for(int i = 0; i < haystack.length(); i++){
            String one = "";
            for (int j = 0; j < needle.length(); j++){
                if (i+j >= haystack.length()) break;
                one += haystack.charAt(i+j);
            }
            if (one.equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public void test(){
        System.out.println(strStr(this.haystack,this.needle));
    }
    public static void main(String[] args){
        Leetcode28 lt = new Leetcode28();
        lt.test();
    }

}
