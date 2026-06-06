package collections.queue;

import java.util.Queue;
import java.util.LinkedList;

public class MyQueue {

	public static void main(String[] args) {
		
// 		Enqueue(add elements)
//		1. add() : adds element in front; throws an error if queue is full
//		2. offer() : also adds element at front; returns false if queue is full
		
		Queue<String> queueReq = new LinkedList<>();
		queueReq.add("Request 1");
		queueReq.add("Request 2");
		queueReq.add("Request 3");
		System.out.println("add(): " + queueReq);
		
		queueReq.offer("Request 4");
		queueReq.offer("Request 5");
		System.out.println("offer(): " + queueReq);
		
		System.out.println("");
		
// 		Dequeue(add elements)
//		1. removes() : removes element in front; throws an error if queue is empty
//		2. poll() : also removes element at front; returns null if queue is empty
		
		String removedElement = queueReq.remove();
		System.out.println("remove(): Element removed --> " + removedElement);
		System.out.println("Updated Queue: " + queueReq);
		
		System.out.println("");
		
		removedElement = queueReq.poll();
		System.out.println("poll(): Element removed --> " + removedElement);
		System.out.println("Updated Queue: " + queueReq);
		
		System.out.println("");
		
//		Peek(view element at front without removing it)
//		if queue is empty it returns null, without throwing any error
		System.out.println("peek(): " + queueReq.peek());
		
		System.out.println("");
		
//		isEmpty(checks if the list is empty or not)
		System.out.println("isEmpty(): " + queueReq.isEmpty());
	}

}
