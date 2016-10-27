//https://www.hackerrank.com/challenges/java-end-of-file

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int line = 0;
		String text;
		while(in.hasNextLine()) {
			text = in.nextLine();
			line++;
			System.out.printf("%d %s\n", line, text);
		}
	}
}