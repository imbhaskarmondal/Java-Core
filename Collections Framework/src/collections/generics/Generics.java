package collections.generics;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		//generics are used for type-safety
		//when we want homogeneous type of data, we use generics
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(100);
		al.add(200);
		//al.add("Ramu"); //error
		//al.add(3.14); //error
		//al.add(true); //error

	}

}
