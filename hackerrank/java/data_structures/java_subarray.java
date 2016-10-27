//https://www.hackerrank.com/challenges/java-negative-subarray

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		
		//this can probably be done efficiently with dynamic programming
		//but it's certainly not necessary for these instances
		
		int sum;
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				sum = 0;
				for(int k = i; k <= j; k++) {
					sum = sum + a[k];
				}
				if(sum < 0) count++;
			}
		}
		
		System.out.println(count);
	}
}