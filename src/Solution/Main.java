package Solution;

import java.util.Scanner;

public class Main { // 20230112

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ox;
		int score = 0;
		
		int N = s.nextInt();
		
		for(int i = 0; i < N; i++) {
			ox = s.next();
			score = 0;
			int cnt = 0;
			
			for(int j = 0; j < ox.length(); j++) {
				if(ox.charAt(j) == 'O') {
					cnt++;
					score += cnt;
				}
				else cnt = 0;
			}
			
			System.out.println(score);
		}
	}

}
