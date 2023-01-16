package Solution;

public class Solution { // 20230113
    public static String convertToTitle(int columnNumber) {
        String answer = "";
        
        while(columnNumber > 0) {
        	columnNumber--;
        	int mod = columnNumber % 26;
        	answer = (char)(65 + mod) + answer;
        	columnNumber /= 26;
        }
        
        System.out.println(answer);
        return answer;
    }
}
