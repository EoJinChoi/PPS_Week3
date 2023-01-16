package Solution;

import java.util.ArrayList;

public class Solution { // 20230113
	public static int calPoints(String[] operations) {
        ArrayList<Integer> record = new ArrayList<Integer>();
        int sum = 0;
        
        for(int i = 0; i < operations.length; i++) {
        	if(operations[i].charAt(0) == '-') {
        		String op = operations[i].substring(1);
        		if(op.charAt(0) >= 48 && op.charAt(0) <= 57) {
            		record.add(Integer.valueOf(op) * (-1));
            	}
        	}
        	else if(operations[i].charAt(0) >= 48 && operations[i].charAt(0) <= 57) {
        		record.add(Integer.valueOf(operations[i]));
        	}
        	else if(operations[i].equals("+")) {
        		record.add(record.get(record.size() - 1) + record.get(record.size() - 2));
        	}
        	else if(operations[i].equals("D")) {
        		record.add(record.get(record.size() - 1) * 2);
        	}
        	else if(operations[i].equals("C")) {
        		record.remove(record.size() - 1);
        	}
        }
        
        for(int i = 0; i < record.size(); i++)
        	sum += record.get(i);
        
//        System.out.println(sum);
        return sum;
    }
}
