package collections.list.linkedlist;

import java.util.LinkedList;

public class LinkedListAsStack {

	public static void main(String[] args) {
		LinkedList stack = new LinkedList();
		
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		
		System.out.println("ll as stack --> " + stack);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	
	}

}
