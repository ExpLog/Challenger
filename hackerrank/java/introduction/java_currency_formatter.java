//https://www.hackerrank.com/challenges/java-currency-formatter?h_r=next-challenge&h_v=zen


import java.util.*;
import java.text.NumberFormat;


public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double money = in.nextDouble();
		NumberFormat nf;
		
		nf = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US: " + nf.format(money));
		
		nf = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
		System.out.println("India: " + nf.format(money));
		
		nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println("China: " + nf.format(money));
		
		nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("France: " + nf.format(money));
	}
}