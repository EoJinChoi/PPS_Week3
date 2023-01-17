package Solution;

import java.util.Arrays;

public class Solution { // 20230114
    public static int heightChecker(int[] heights) {
    	int cnt = 0;
        int[] order = new int[heights.length];
        
        for(int i = 0; i < heights.length; i++) {
        	order[i] = heights[i];
        }
        Arrays.sort(order);
        
        for(int i = 0; i < heights.length; i++) {
        	if(heights[i] != order[i]) cnt++;
        }
        
        System.out.println(cnt);
        return cnt;
    }
}
