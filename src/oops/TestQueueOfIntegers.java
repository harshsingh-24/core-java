package oops;

public class TestQueueOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueOfIntegers queue = new QueueOfIntegers();
		for(int i=0; i<20; i++) {
			queue.enqueue(i);
			System.out.println("Enqueue: " + i);
		}
		
		for(int i=0; i<20; i++) {
			int value = queue.dequeue();
			System.out.println("Dequeued: " + value);
		}
	}

}
