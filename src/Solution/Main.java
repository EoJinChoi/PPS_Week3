package Solution;

import java.io.*;
import java.util.*;

public class Main { // 20230112

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String order = br.readLine();
			
			if(order.contains("push")) {
				stack.push(Integer.valueOf(order.substring(order.indexOf(' ') + 1)));
			}
			else if(order.equals("pop")) {
				if(stack.empty()) System.out.println(-1);
				else System.out.println(stack.pop());
			}
			else if(order.equals("size")) {
				System.out.println(stack.size());
			}
			else if(order.equals("empty")) {
				if(stack.empty()) System.out.println(1);
				else System.out.println(0);
			}
			else if(order.equals("top")) {
				if(stack.empty()) System.out.println(-1);
				else System.out.println(stack.peek());
			}
		}
	}
}
