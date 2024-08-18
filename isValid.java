package Leetcode.Simple100;

import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
/**
 * 有效的括号
 */
public class isValid {
    private String s = "[{()}]";
    private static final Map<Character,Character> map = new HashMap<Character,Character>(){{
        put('{','}'); put('[',']'); put('(',')'); put('?','?');
    }};

    public boolean Valid(String s){
        Stack<Character> stack = new Stack<>();
        stack.push('?');
        if (s.length() > 0 && !map.containsKey(s.charAt(0))) return false;
        for (Character c : s.toCharArray()){
            if (map.containsKey(c)) stack.push(c);
            else if (map.get(stack.pop()) != c) return false;
        }
        return stack.size() == 1;
    }
    public void test(){
        System.out.println(Valid(this.s));
    }
    public static void main(String[] args){
        isValid iv = new isValid();
        iv.test();
    }


}
