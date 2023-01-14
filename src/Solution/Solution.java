package Solution;

public class Solution { // 20230109
	public static boolean checkRecord(String s) {
        boolean result = true;
        int cntA = 0;
        int cntL = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	cntL = 0;
        	if(s.charAt(i) == 'A') {
        		cntA++;
        		if(cntA >= 2) {
        			result = false;
        			break;
        		}
        	}
        	else if(s.charAt(i) == 'L') {
        		for(int j = i; j < s.length(); j++) {
        			if(s.charAt(j) == 'L') cntL++;
        			else break;
        		}
        		if(cntL >= 3) {
        			result = false;
        			break;
        		}
        	}
        }
        
//        System.out.println(result);
        return result;
    }
}
