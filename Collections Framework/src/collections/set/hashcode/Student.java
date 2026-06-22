package collections.set.hashcode;

import java.util.Objects;

//try to observe the output, once with Overriding the methods and once without Overriding the methods
//hashcode() and equals() compare objects based ob their hashcode/address
//by overriding, we make them compare on the data
public class Student {
	
	int roll;
	String name;
	
	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	
	public void introduce() {
		System.out.println("Student name: " + name);
		System.out.println("Student roll no. : " + roll);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		Student s = (Student) obj;
		return roll == s.roll && name.equals(s.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(roll, name);
	}
}
