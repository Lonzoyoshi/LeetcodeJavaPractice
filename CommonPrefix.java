package Leetcode.Simple100;

import java.util.ArrayList;
import java.util.List;

/**
 * 最大公共前缀
 */
public class CommonPrefix {
    private String[] strs = {"nigger", "negro", "noway"};

    CommonPrefix() {
    }

    ;

    CommonPrefix(String[] strs) {
        this.strs = strs;
    }

    public String longestCommonPrefix(String[] strs) {
        // 判空
        if (strs == null || strs.length == 0) {
            return "";
        }
        // 获取所有可能的最长前缀
        List<String> strsList = new ArrayList<>();
        for (int i = 0; i < strs[0].length(); i++) {
            strsList.add(strs[0].substring(0, i + 1));
        }
        // 遍历所有可能的前缀
        String result = "";
        String resVal = "";
        for (int i = 0; i < strsList.size(); i++) {
            String val1 = strsList.get(i);
            boolean isVal = true;
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].length() < val1.length()){
                    isVal = false;
                    break;
                }
                String val2 = strs[j].substring(0, val1.length());
                if (!val1.equals(val2)) {
                    isVal = false;
                    break;
                }
            }
            if (!isVal) {
                break;
            }
            else{
                result = val1;
            }
        }
        return result;
    }
    public void test(){
        System.out.println(longestCommonPrefix(this.strs));
    }
    public static void main(String[] args){
        CommonPrefix cp1 = new CommonPrefix();
        cp1.test();
    }
}
