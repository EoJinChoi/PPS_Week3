package Solution;

import java.util.Scanner;

public class Main { // 20230109

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] cnt = new int[26];
		char answer = ' ';
		
		String str = s.next();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90)
				cnt[str.charAt(i) - 65]++;
			else if(str.charAt(i) >= 97 && str.charAt(i) <= 122)
				cnt[str.charAt(i) - 97]++;
		}
		
		int max = 0;
		for(int i = 0; i < 26; i++) {
			if(cnt[i] > max) {
				max = cnt[i];
				answer = (char)(i + 65);
			}
			else if(cnt[i] == max)
				answer = '?';
		}
		
		System.out.println(answer);
	}

}
