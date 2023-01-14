package Solution;

import java.util.Stack;

public class Solution { // 20230109
	public static boolean backspaceCompare(String s, String t) {
		Stack<Character> stackS = new Stack<>();
		Stack<Character> stackT = new Stack<>();
		String newS = "";
		String newT = "";
		boolean result = true;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '#') {
				if(!stackS.empty())
					stackS.pop();
			}
			else stackS.push(s.charAt(i));
		}
		for(int i = 0; i < t.length(); i++) {
			if(t.charAt(i) == '#') {
				if(!stackT.empty())
					stackT.pop();
			}
			else stackT.push(t.charAt(i));
		}
		
		while(!stackS.empty())
			newS += stackS.pop();
		while(!stackT.empty())
			newT += stackT.pop();
		
		if(!newS.equals(newT)) result = false;
//		System.out.println(result);
        
        return result;
    }
}
