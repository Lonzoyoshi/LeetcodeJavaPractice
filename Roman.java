package Leetcode.SimpleQus;

import java.util.HashMap;
import java.util.Map;

/**
    罗马数转型整数
 */
public class Roman {
    private String str = "MCMXCIV";
    Roman(){};
    Roman(String str){
        this.str=str;
    }
    public int romanToInt(String s){
        int resInt = 0;
        // 1.定义规则
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);
        // 2.解析规则
        int index = 0;
        int [] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++){
            String v1 = s.charAt(i) + "";
            String v2 = null;
            if (i < s.length() - 1) {
                v2 = "" + s.charAt(i) + s.charAt(i + 1) + "";
            }
            if (v2 != null && map.containsKey(v2)){
                result[index++] = map.get(v2);
                i++;
                continue;
            }
            if (map.containsKey(v1)){
                result[index++] = map.get(v1);
            }
        }
        // 3.计算结果
        for (int i = 0; i < result.length; i++){
            resInt += result[i];
        }

        return resInt;
    }
    public void test(){
        System.out.println(romanToInt(this.str));
    }
    public static void main(String[] args){
        Roman r1 = new Roman();
        r1.test();
    }
}