package Solution;

import java.io.*;

public class Main { // 20230111

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String code = br.readLine();
		String word = "";
		
		for(int i = 0; i < code.length(); i++) {
			if(code.charAt(i) > 67) {
				word += (char)(code.charAt(i) - 3);
			}
			else {
				word += (char)(code.charAt(i) + 23);
			}
		}
		
		System.out.println(word);
	}

}
