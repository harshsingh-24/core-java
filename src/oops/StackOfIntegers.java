package oops;

public class StackOfIntegers {
	
	// data fields - list of elements, size, default capacity (constant of 16)
	private int[] elements;
	private int size; 
	private static final int DEFAULT_CAPACITY = 16; // 1,000,000 
	
	// Default Constructor
	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}
	
	// Parametrised Constructors
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}
	
	// Getters and setters
	public int getSize() {
		return size;
	}
	
	// Methods
	
	/** Return the top element from the stack */
	public int peek() {
		return elements[size - 1]; // 16 -> elements[15]
	}
	
	/** Push a new integer to top of stack */
	public void push(int value) {
		// if the array is full or not
		if(size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp; // reference variables equal implies both arrays 
			// pointing towards new array
		}
		// size: 14,capacity: 16, elements[14] = value;
		elements[size++] = value;
	}
	
	/** Return and remove the top element from the stack */
	public int pop() {
		return elements[--size];
	}
	
	/**
	 *  Test whether the stack is empty or not
	 */
	public boolean empty() {
		return (size == 0);
	}
	
}
