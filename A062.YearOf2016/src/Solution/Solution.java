package Solution;

public class Solution { // 20230114
	public static String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int idx;
        
        if(a == 1 || a == 4 || a == 7) { // FRI
        	idx = b % 7 - 1;
        	if(idx < 0) idx += 7;
        	answer = day[idx];
        }
        else if(a == 2 || a == 8) { // MON
        	idx = b % 7 + 2;
        	if(idx >= 7) idx -= 7;
        	answer = day[idx];
        }
        else if(a == 3 || a == 11) { // TUE
        	idx = b % 7 + 3;
        	if(idx >= 7) idx -= 7;
        	answer = day[idx];
        }
        else if(a == 5) { // SUN
        	idx = b % 7 + 1;
        	if(idx >= 7) idx -= 7;
        	answer = day[idx];
        }
        else if(a == 6) { // WED
        	idx = b % 7 + 4;
        	if(idx >= 7) idx -= 7;
        	answer = day[idx];
        }
        else if(a == 9 || a == 12) { // THU
        	idx = b % 7 + 5;
        	if(idx >= 7) idx -= 7;
        	answer = day[idx];
        }
        else if(a == 10) { // SAT
        	answer = day[b % 7];
        }
        
//        System.out.println(answer);
        return answer;
    }
}
