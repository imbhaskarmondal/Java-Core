package collections.set.hashcode;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student(101, "Rohit");
		Student s2 = new Student(101, "Rohit");
		
		s1.introduce();
		s2.introduce();
		
		System.out.println("\nAre both objects equal? : " + s1.equals(s2));
		
		HashSet<Student> hs = new HashSet<>();
		hs.add(s1);
		hs.add(s2);
		
		System.out.println("\nStudent HashSet: ");
		System.out.println(hs);
	}

}
