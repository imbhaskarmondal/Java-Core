
public class _02_Queue {
	private int[] arr;
	private int size;
	private int front;
	private int rear;
	
	public _02_Queue(int size) {
		arr = new int[size];
		this.size = size;
		front = -1;
		rear = -1;
	}
	
	public void insert(int value) {
		if(rear == size-1) {
			System.out.println("Queue is full.");
		}
		else {
			rear++;
			arr[rear] = value;
		}
	}
	
	public void delete() {
		if((front == rear) || (front == size - 1)) {
			System.out.println("Queue is Empty!");
		}
		else {
			front++;
			arr[front] = 0;
		}
	}
	
	public void display() {
		if((front == rear) || (front == size - 1)) {
			System.out.println("Queue is Empty!");
		}
		else {
			for(int i = front + 1; i <= rear; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("");
		}
	}
	
}
