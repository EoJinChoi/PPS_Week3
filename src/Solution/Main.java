package Solution;

import java.util.Scanner;

public class Main { // 20230111

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String word;
		char prev;
		int result = 0;
		
		int N = s.nextInt();
		
		for(int i = 0; i < N; i++) {
			boolean[] check = new boolean[26];
			boolean bool = true;
			
			word = s.next();
			prev = word.charAt(0);
			check[word.charAt(0) - 'a'] = true;
			for(int j = 1; j < word.length(); j++) {
				if(word.charAt(j) != prev) {
					if(check[word.charAt(j) - 97]) {
						bool = false;
						break;
					}
				}
				check[word.charAt(j) - 97] = true;
				prev = word.charAt(j);
			}
			if(bool) result++;
		}
		
		System.out.println(result);
	}

}
