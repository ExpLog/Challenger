//https://www.hackerrank.com/challenges/java-1d-array

import java.util.*;

public class Solution {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = in.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = in.nextInt();
			int m = in.nextInt();
			int[] a = readArray(n);
			String winnable = canWin(a, n, m);
			System.out.println(winnable);
		}
	}
	
	static int[] readArray(int n) {
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		return a;
	}
	
	// a plain old bfs
	static String canWin(int[] a, int n, int m) {
		boolean[] visited = new boolean[n];
		Arrays.fill(visited, false);
		Queue<Integer> toCheck = new LinkedList<Integer>();
		toCheck.add(0);		
		
		while(!toCheck.isEmpty()){
			int curr = toCheck.remove();
			visited[curr] = true;
			
			if(a[curr] == 1) continue; //blocked
			
			if(curr+1 >= n || curr+m >= n) return "YES"; //reached the end
			if(curr > 0 && !visited[curr-1]) toCheck.add(curr-1);
			//these can never reach out of bounds, since we are returning before that.
			if(!visited[curr+1]) toCheck.add(curr+1); 
			if(!visited[curr+m]) toCheck.add(curr+m);
		}
		
		return "NO";
	}
}