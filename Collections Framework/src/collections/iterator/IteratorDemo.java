package collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100); 
		//al.add(new Integer(100)); --> BOXING
		//BOXING (converting primitive type to Object type)
		//AUTOBOXING --> when Boxing happens automatically
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		System.out.println("Iterating using normal for loop:");
		System.out.print("[");
		for(int i = 0; i < al.size(); i++) {
			if(i < al.size() - 1) {
				System.out.print(al.get(i) + ", ");
			}
			if(i == al.size() - 1) {
				System.out.print(al.get(i) + "]");
			}
		}
		
		System.out.println("");
		
		System.out.println("\nIterating using enhanced for loop:");
		System.out.print("[");
		for(Object obj : al) {
			if(al.indexOf(obj) < al.size() - 1) {
				System.out.print(obj + ", ");
			}
			if(al.indexOf(obj) == al.size() - 1) {
				System.out.print(obj + "]");
			}
		}
		
		System.out.println("");
		
		System.out.println("\nIterating using Iterator:");
		System.out.print("[");
		Iterator itr = al.iterator();
		int count = 0;
		while(itr.hasNext()) {
			System.out.print(itr.next());
			if(count != al.size()-1) {
				System.out.print(", ");
			}
			count++;
		}
		System.out.print("]");

	}

}
