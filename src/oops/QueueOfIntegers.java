package oops;

// Queue of Integers
public class QueueOfIntegers {
	
	// data fields
	private int[] elements;
	private int size;
	private static final int DEFAULT_CAPACITY = 8;
	
	// Constructors
	public QueueOfIntegers() {
		elements = new int[DEFAULT_CAPACITY];
		size = 0;
	}
 	
	// getters and setters
	public int getSize() {
		return size;
	}
	
	public void enqueue(int v) {
		if(size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp; // reference variables equal implies both arrays 
			// pointing towards new array
		}
		elements[size] = v;
		size++;
	}
	
	public int dequeue() {
		int res = -1;
		if(size > 0) {
			res = elements[0]; // 0 <- 1, 1 <- 2, 2 <- 3
			for(int i=1; i<size; i++) {
				elements[i-1] = elements[i];
			}
			size--;
		}
		return res;
	}
	
	// methods
	public boolean empty() {
		return size == 0;
	}
	
}
