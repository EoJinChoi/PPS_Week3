package Solution;

import java.io.*;

public class Main { // 20230109

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		for(int i = 1; i <= str.length(); i++) {
			if(i == str.length()) {
				if(i % 10 != 0)
					System.out.println(str.substring(i - (i % 10)));
				else
					System.out.println(str.substring(i-10, i));
			}
			else if(i % 10 == 0)
				System.out.println(str.substring(i-10, i));
		}
	}
}
