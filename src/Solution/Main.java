package Solution;

import java.util.Scanner;

public class Main { // 20230111

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String dial = s.next();
		int sec = 0;
		
		for(int i = 0; i < dial.length(); i++) {
			if(dial.charAt(i) <= 67) sec += 3;
			else if(dial.charAt(i) <= 70) sec += 4;
			else if(dial.charAt(i) <= 73) sec += 5;
			else if(dial.charAt(i) <= 76) sec += 6;
			else if(dial.charAt(i) <= 79) sec += 7;
			else if(dial.charAt(i) <= 83) sec += 8;
			else if(dial.charAt(i) <= 86) sec += 9;
			else if(dial.charAt(i) <= 90) sec += 10;
		}
		
		System.out.println(sec);
	}

}
