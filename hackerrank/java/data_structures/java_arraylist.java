//https://www.hackerrank.com/challenges/java-arraylist

import java.util.*;

public class Solution {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int d;
		List<List<Integer>> numbers = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			List<Integer> line = new ArrayList<>();
			d = in.nextInt();
			for(int j = 0; j < d; j++) {
				line.add(in.nextInt());
			}
			numbers.add(line);
		}
		
		int q = in.nextInt();
		int x, y;
		for(int i = 0; i < q; i++) {
			x = in.nextInt();
			y = in.nextInt();
			try {
				System.out.println(numbers.get(x-1).get(y-1));
			} catch (Exception e) {
				System.out.println("ERROR!");
			} 
		}
    }
}