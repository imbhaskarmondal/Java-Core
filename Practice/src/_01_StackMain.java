
public class _01_StackMain {

	public static void main(String[] args) {
		_01_Stack stack = new _01_Stack(5);
		
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.display();
		
		stack.pop();
		stack.display();
		
		stack.pop();
		stack.display();
		
		System.out.println("");
		
		stack.pop();
		stack.display();
		
		System.out.println("");
		
		stack.pop();
		stack.display();
		
		System.out.println("");
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);
		stack.display();
		
		stack.add(6);
		stack.display();
	}

}
