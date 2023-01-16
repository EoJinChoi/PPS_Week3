package Solution;

import java.util.Stack;

public class Solution { // 20230112
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i < moves.length; i++) {
        	for(int j = 0; j < board.length; j++) {
        		if(board[j][moves[i] - 1] != 0) {
        			if(!s.empty()) {
        				if(s.peek() == board[j][moves[i] - 1]) {
            				s.pop();
            				board[j][moves[i] - 1] = 0;
            				answer += 2;
            			}
            			else {
    	        			s.push(board[j][moves[i] - 1]);
    	        			board[j][moves[i] - 1] = 0;
            			}
        			}
        			else {
        				s.push(board[j][moves[i] - 1]);
	        			board[j][moves[i] - 1] = 0;
        			}
        			break;
        		}
        	}
        }
//        System.out.println(answer);
        return answer;
    }
}
