package collections.queue.arraydeque;

import java.util.ArrayDeque;

public class ArrayDeque_02 {

	public static void main(String[] args) {
		//Implementing Queue using ArrayDeque
		ArrayDeque queue = new ArrayDeque();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		
		System.out.println("ArrayDeque as Queue:");
		System.out.println("Queue: " + queue);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println("");
		
		//Implementing Queue using ArrayDeque
		ArrayDeque stack = new ArrayDeque();
		stack.add(10);
		stack.add(20);
		stack.add(30);
		stack.add(40);
		stack.add(50);
		
		System.out.println("Implement Stack using ArrayDeque");
		System.out.println("Stack:" + stack);
		
		System.out.println(stack.pollLast());
		System.out.println(stack.pollLast());
		System.out.println(stack.pollLast());
		System.out.println(stack.pollLast());
		System.out.println(stack.pollLast());

	}

}
