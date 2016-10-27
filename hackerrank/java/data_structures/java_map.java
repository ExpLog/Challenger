//https://www.hackerrank.com/challenges/phone-book

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
        in.nextLine(); //flush dangling \\n
		Map<String, String> map = new HashMap<>();
		String name, number;
		for(int i = 0; i < n; i++) {
			name = in.nextLine();
			number = in.nextLine();
			map.put(name, number);
		}
		
		String out;
		while(in.hasNext()) {
			name = in.nextLine();
			if(map.containsKey(name)){
				System.out.printf("%s=%s\n", name, map.get(name));
			} else {
				System.out.println("Not found");
			}
		}
	}
}