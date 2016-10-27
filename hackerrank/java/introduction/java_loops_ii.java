//https://www.hackerrank.com/challenges/java-loops

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int queries = in.nextInt();
		int a, b, n;
		
		for(int i = 0; i < queries; i++) {
			a = in.nextInt();
			b = in.nextInt();
			n = in.nextInt();
			System.out.println(String.join(" ", series(a, b, n)));
		}
	}
	
	static List<String> series(int a, int b, int n) {
		List<String> arr = new ArrayList<>();
		int acc = b;
		int prev = a + b;
		arr.add(Integer.toString(prev));
        for(int i = 1; i < n; i++) {
			acc = acc*2;
			arr.add(Integer.toString(prev + acc));
            prev = prev + acc;
		}
		return arr;
	}
}