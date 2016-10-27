//https://www.hackerrank.com/challenges/java-sort

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = Integer.parseInt(in.nextLine());
		
		List<Student> sl = new ArrayList<Student>();
		int id;
		String name;
		double cgpa;
		for(int i = 0; i < n; i++) {
			id = in.nextInt();
			name = in.next();
			cgpa = in.nextDouble();
			sl.add(new Student(id, name, cgpa));
		}
		
		sl.sort(Comparator.
				comparing(Student::getCgpa).
				reversed().
				thenComparing(Student::getFname).
				thenComparing(Student::getId)
			);
		
		for(Student s : sl) {
			System.out.println(s.getFname());
		}
	}
}

class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}