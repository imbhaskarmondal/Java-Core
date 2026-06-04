package collections.generics;

public class BoxMain {

	public static void main(String[] args) {
		//Creating a Box for Strings
		Box<String> stringBox = new Box<>();
		stringBox.setItem("Textbook");
		System.out.println("String item: " + stringBox.getItem());
		
		//Creating a Box for Integers
		Box<Integer> intBox = new Box<>();
		intBox.setItem(101);
		System.out.println("Integer item: " + intBox.getItem());

	}

}
