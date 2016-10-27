//https://www.hackerrank.com/challenges/java-stack

import java.util.*;

public class Solution {
	private final static Map<Character, Character> pair = new HashMap<>();
	static {
		pair.put('[', ']');
		pair.put('{', '}');
		pair.put('(', ')');		
	}	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			String str = in.nextLine().trim();
			System.out.println(balance_brackets(str));
		}
	}
	
	public static char pop(List<Character> stack) {
		return stack.remove(stack.size()-1);
	}
	
	public static boolean balance_brackets(String str) {
		List<Character> stack = new ArrayList<>();
		for(char c : str.toCharArray()) {
			if(pair.containsKey(c)) {
				stack.add(c);
			} else if(stack.isEmpty() || pair.get(pop(stack)) != c) return false;
		}
		return true && stack.isEmpty();
	}
}