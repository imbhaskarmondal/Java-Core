package collections.list.arraylist;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(75);
		al.add(25);
		al.add(125);
		al.add(175);
		
		al.add("Ramu");
		al.add(3.14f);
		al.add(true);
		al.add('X');
		
		System.out.println(al);
		System.out.println("Size: " + al.size());
		
		al.add(2, 999);
		System.out.println(al);
		System.out.println("Size: " + al.size());
		
		System.out.println(al.contains(999));
		System.out.println(al.get(2));
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		System.out.println(al.indexOf(999));
		System.out.println(al.remove(2));
		System.out.println(al);
		System.out.println("Size: " + al.size());
		

	}

}
