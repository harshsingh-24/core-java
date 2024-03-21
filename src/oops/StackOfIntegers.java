package oops2;

public class StackOfIntegers {
	
	// data fields
	private int[] elements; // declaration of array
	private int size;
	private static final int DEFAULT_CAPACITY = 16;
	
	// constructors
	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}
	
	public StackOfIntegers(int capacity) {
		elements = new int[capacity]; // creation of array
	}
	
	// getters and setters
	public int getSize() {
		return size;
	}

	// methods
	public void push(int value) {
		// if stack has space
		if(size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		
		elements[size++] = value;
	}
	
	public int pop() { // size - 1
		return elements[--size];
	}
	
	public boolean empty() {
		return (size == 0);
	}
	
	// top element of the stack
	public int peek() {
		return elements[size - 1];
	}
	
}
