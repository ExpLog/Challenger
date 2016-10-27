//https://www.hackerrank.com/challenges/java-list

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> l = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			l.add(in.nextInt());
		}
		
		int q = in.nextInt();
		String op;
		int x, y;
		for(int i = 0; i < q; i++) {
			op = in.next();
			x = in.nextInt(); //there is always at least one next integer
			
			if(op.equals("Insert")) {
				y = in.nextInt();
				l.add(x, y);
			}
			
			if(op.equals("Delete")) {
				l.remove(x);
			}
		}
		
		System.out.println(l.toString().replaceAll(",\\[\\]", ""));
	}
}