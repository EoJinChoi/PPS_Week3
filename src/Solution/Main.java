package Solution;

import java.io.*;

public class Main { // 20230111

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String pw = "";
		
		while(true) {
			boolean bool = true;
			boolean vowel = false;
			int v = 0;
			int c = 0;
			
			pw = br.readLine();
			if(pw.equals("end")) break;
			
			for(int i = 0; i < pw.length(); i++) {
				if(pw.charAt(i) == 'a' || pw.charAt(i) == 'e' || pw.charAt(i) == 'i' || pw.charAt(i) == 'o' || pw.charAt(i) == 'u') {
					vowel = true;
					v++;
					c = 0;
				}
				else {
					v = 0;
					c++;
				}
				if(v == 3 || c == 3) {
					bool = false;
					break;
				}
				if(i > 0 && pw.charAt(i) == pw.charAt(i - 1)) {
					if(pw.charAt(i) != 'e' && pw.charAt(i) != 'o') {
						bool = false;
						break;
					}
				}
			}
			if(!vowel) bool = false;
			
			if(bool) System.out.println("<" + pw + ">" + " is acceptable.");
			else System.out.println("<" + pw + ">" + " is not acceptable.");
		}
	}

}
