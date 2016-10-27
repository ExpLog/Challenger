//https://www.hackerrank.com/challenges/java-bitset

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		BitSet[] bs = {new BitSet(n), new BitSet(n)};
		
		String op;
		int x, y;
		for(int i = 0; i < m; i++) {
			op = in.next();
			x = in.nextInt();
			y = in.nextInt();
			
			switch(op) {
				case "AND": bs[x-1].and(bs[y-1]); break;
				case "OR": bs[x-1].or(bs[y-1]); break;
				case "XOR": bs[x-1].xor(bs[y-1]); break;
				case "FLIP": bs[x-1].flip(y); break;
				case "SET": bs[x-1].set(y); break;
			}
			
			System.out.printf("%d %d\n", bs[0].cardinality(), bs[1].cardinality());
		}
	}
}