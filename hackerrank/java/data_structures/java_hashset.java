//https://www.hackerrank.com/challenges/java-hashset

// import java.util.*;

//god damned website wants to give me pre-written code
// public class Solution {
	// public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// int t = in.nextInt();
		// in.nextLine();
		// Set<String> set = new HashSet<>();
		// for(int i = 0; i < t; i++) {
			// set.add(in.nextLine);
			// System.out.prinln(set.size());
		// }
	// }
// }

Set<String> set = new HashSet<>();
for(int i = 0; i < t; i++) {
    set.add(pair_left[i] + "," + pair_right[i]);
    System.out.println(set.size());
}