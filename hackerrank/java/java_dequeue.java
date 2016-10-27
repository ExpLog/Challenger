//https://www.hackerrank.com/challenges/java-dequeue

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		Set<Integer> unique = new HashSet<Integer>();
		Deque<Integer> dq = new ArrayDeque<>();
		for(int i = 0; i < m; i++) {
			int num = in.nextInt();
			dq.add(num);
			unique.add(num);
		}
		
		int max = unique.size();		
		for(int i = m; i < n; i++) {
			int newNum = in.nextInt();
			dq.add(newNum);
			unique.add(newNum);
			
			int oldNum = dq.remove();
			if(!dq.contains(oldNum)) unique.remove(oldNum);
			max = Math.max(max, unique.size());
		}
		
		System.out.println(max);
	}
}