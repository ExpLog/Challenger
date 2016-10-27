//https://www.hackerrank.com/challenges/java-output-formatting

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String bar = "================================";
		String format = "%-15s%03d\n";
		String str;
		int i;
		
        System.out.println(bar);
		for(int k = 0; k < 3; k++) {
			str = in.next();
			i = in.nextInt();
			System.out.printf(format, str, i);
		}
        System.out.println(bar);
	}
}