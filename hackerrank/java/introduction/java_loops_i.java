//https://www.hackerrank.com/challenges/java-loops-i?h_r=next-challenge&h_v=zen

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", n, i, n*i);
		}
	}
}