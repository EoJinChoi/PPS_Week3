package Solution;

import java.util.Scanner;

public class Main { // 20230109

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name;
		int[] cnt = new int[26];
		String answer = "";
		
		int N = s.nextInt();
		
		for(int i = 0; i < N; i++) {
			name = s.next();
			cnt[name.charAt(0) - 97]++;
		}
		
		for(int i = 0; i < 26; i++) {
			if(cnt[i] >= 5) answer += (char)(i + 97);
		}
		if(answer.equals("")) answer = "PREDAJA";
		
		System.out.println(answer);
	}
}
