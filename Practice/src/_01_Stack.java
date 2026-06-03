
public class _01_Stack {
	int[] arr;
	int size;
	int top;
	
	public _01_Stack(int size) {
		arr = new int[size];
		this.size = size;
		this.top = -1;
	}
	
	public void add(int val) {
		if(top == arr.length - 1) {
			System.out.println("Stack is Full");
		}
		else {
			arr[top+1] = val;
			top++;
		}
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("Stack is empty. No element to remove.");
		}
		else {
		arr[top] = 0;
		top--;
		}
	}
	
	public void display() {
		if(top == -1) {
			System.out.println("Stack is Empty!");
		}
		else {
			for(int i = top; i >= 0; i--) {
				System.out.println(arr[i]);
			}
		}
	}
}
