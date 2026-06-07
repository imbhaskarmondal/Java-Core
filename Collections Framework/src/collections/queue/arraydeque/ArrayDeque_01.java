package collections.queue.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque_01 {

	public static void main(String[] args) {
		// ArrayDeque is a class in Java that allows you to add or remove items from both front and back end of the collection.
		//It stands for Array Double Ended Queue and is a Java Collections Framework.
		
		//Adding Elements
		//1. addFirst()
		//2. addLast()
		Deque<String> taskList = new ArrayDeque<>();
		
		taskList.addFirst("Task 1");
		taskList.addLast("Task 2");
		taskList.addLast("Task 3");
		
		System.out.println("Adding Elements:");
		System.out.println("Task List: " + taskList);
		
		System.out.println("");
		
		//Removing Elements
		//1. removeFirst()
		//2. removeLast()
		System.out.println("Removing Elements:");
		
		System.out.println("Task Lists: " + taskList + "\n");
		
		String removedItem = taskList.removeFirst();
		System.out.println("First removed element: " + removedItem);
		System.out.println("Updated Task Lists: " + taskList);
		
		System.out.println("");
		
		removedItem = taskList.removeLast();
		System.out.println("Last removed element: " + removedItem);
		System.out.println("Updated Task Lists: " + taskList);
		
		System.out.println("");
		
		//Peek
		//1. peekFirst()
		//2. peekLast()
		
		System.out.println("Peek:");
		System.out.println("peekFirst(): " + taskList.peekFirst());
		System.out.println("peekFirst(): " + taskList.peekLast());
		

	}

}
