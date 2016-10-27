//https://www.hackerrank.com/challenges/java-date-and-time?h_r=next-challenge&h_v=zen


import java.util.*;
import java.time.LocalDate;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		int day = in.nextInt();
		int year = in.nextInt();
		LocalDate date = LocalDate.of(year, month, day);
		System.out.println(date.getDayOfWeek());
	}
}