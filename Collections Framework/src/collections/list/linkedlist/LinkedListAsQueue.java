package collections.list.linkedlist;

import java.util.LinkedList;

public class LinkedListAsQueue {

	public static void main(String[] args) {
		LinkedList queue = new LinkedList();
		
		queue.add(9);
		queue.add(99);
		queue.add(999);
		queue.add(9999);
		
		System.out.println("ll as Queue --> " + queue);
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());

	}

}
