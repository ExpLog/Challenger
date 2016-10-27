//https://www.hackerrank.com/challenges/java-2d-array


import java.util.*;


public class Solution {
	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		read_matrix(arr, 6);
		int max_sum = Integer.MIN_VALUE;
		for(int i = 0; i+2 < 6; i++) {
			for(int j = 0; j+2 < 6; j++) {
				max_sum = Math.max(max_sum, hourglass_sum(arr, i, j));
			}
		}
		System.out.println(max_sum);
	}
	
	static void read_matrix(int[][] m, int n) {
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				m[i][j] = in.nextInt();
			}
		}
	}
	
	static int hourglass_sum(int[][] m, int i, int j) {
		// i and j are the coordinates for the top left corner of the hourglass
		// assumes i+2 < num_rows, same for j with cols
		int sum = 0;
		for(int k = j; k < j + 3; k++) {
			sum = sum + m[i][k];
		}
		sum = sum + m[i+1][j+1];
		for(int k = j; k < j + 3; k++) {
			sum = sum + m[i+2][k];
		}
		return sum;
	}
}