package Solution;

public class Solution { // 20230113
	public static int solution(int[] cookie) {
        int answer = 0;
        int l = 0;
        int r = 0;
        
        for(int i = 0; i < cookie.length - 1; i++) {
        	l = i;
        	r = i + 1;
        	int sumL = cookie[l];
        	int sumR = cookie[r];
        	
        	while(l >= 0 && r < cookie.length) {
        		if(sumL == sumR) {
        			answer = Math.max(answer, sumL);
        			l--;
        			r++;
        			if(l < 0 || r >= cookie.length) break;
        			
        			sumL += cookie[l];
        			sumR += cookie[r];
        		}
        		else if(sumL < sumR) {
        			l--;
        			if(l < 0) break;
        			sumL += cookie[l];
        		}
        		else {
        			r++;
        			if(r >= cookie.length) break;
        			sumR += cookie[r];
        		}
        	}
        }
//        System.out.println(answer);
        return answer;
    }
}
