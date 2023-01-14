package Solution;

public class Solution { // 20230109
	public static String longestCommonPrefix(String[] strs) {
        String result = "";
        char c;
        int idx = 0;
        
        for(int i = 1; i < strs.length; i++) {
        	if(strs[i].length() < strs[idx].length())
        		idx = i;
        }
        
        for(int i = 0; i < strs[idx].length(); i++) {
        	c = strs[idx].charAt(i);
        	boolean bool = true;
        	for(int j = 0; j < strs.length; j++) {
        		if(c != strs[j].charAt(i)) {
        			bool = false;
        			break;
        		}
        	}
        	if(bool) result += strs[idx].charAt(i);
        	else break;
        }
        
//        System.out.println(result);
        return result;
    }
}
