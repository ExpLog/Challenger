//https://www.hackerrank.com/challenges/java-priority-queue

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		in.nextLine();
		
		Queue<Student> q = new PriorityQueue<>();
		for(int i = 0; i < n; i++) {
			String event = in.next();
			
			if(event.equals("ENTER")) {
				String name = in.next();
				double gpa = in.nextDouble();
				int token = in.nextInt();
				if(in.hasNext()) in.nextLine();
				q.add(new Student(name, gpa, token));
			} else {
				if(!q.isEmpty()) q.remove();
			}
		}
		
		if(q.isEmpty()){
			System.out.println("EMPTY");
		} else {
			while(!q.isEmpty()){
				System.out.println(q.remove().getName());
			}
		}
	}
}


class Student implements Comparable<Student> {
	private String name;
	private double gpa;
	private int token;
	
	public Student(String name, double gpa, int token) {
		this.name = name;
		this.gpa = gpa;
		this.token = token;
	}
	
	public int compareTo(Student other) {
		if(getClass() != other.getClass()) throw new ClassCastException();
		Student otherStudent = (Student) other;
		int res = (int) Math.signum(-(gpa - otherStudent.gpa));
		if(res == 0) res = name.compareTo(otherStudent.name);
		if(res == 0) res = token - otherStudent.token;
		return res;
	}
	
	public String getName(){return name;}
	public double getGPA(){return gpa;}
	public int getToken(){return token;}
}