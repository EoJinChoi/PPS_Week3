package Solution;

import java.util.Stack;

public class Solution { // 20230112
	public static String removeOuterParentheses(String s) {
        Stack<String> stack = new Stack<>();
        String str = "";
        int n = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == '(')
        		stack.push(String.valueOf(s.charAt(i)));
        	else if(s.charAt(i) == ')') {
        		stack.pop();
        		if(stack.empty()) {
        			str += s.substring(n + 1, i);
        			n = i + 1;
        		}
        	}
        }
//        System.out.println(str);
        return str;
    }
}
