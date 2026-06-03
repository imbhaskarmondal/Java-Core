package collenctions.list.linkedlist;

import java.util.LinkedList;
import java.util.ArrayList;

public class myLinkedList {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add("Ramu");
		ll.add(3.147);
		System.out.println(ll);
		
		ll.addFirst(9);
		System.out.println(ll);
		
		ll.add(3, 999);
		System.out.println(ll);
		
		ArrayList al = new ArrayList();
		al.add(8);
		al.add(88);
		al.add(888);
		
		System.out.println("al --> " + al);
		System.out.println("ll --> " + ll);
		
		ll.addAll(al);
		System.out.println("ll --> " + ll);
		
		ll.addAll(0, al);
		System.out.println("ll --> " + ll);
		
		System.out.println(al.containsAll(ll));
		System.out.println(ll.containsAll(al));
	}

}
