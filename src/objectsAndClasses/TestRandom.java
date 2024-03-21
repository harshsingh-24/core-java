package objectsAndClasses;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Math.random()
//		for(int i=0; i<10; i++) {
//			System.out.print((int)(Math.random() * 100) + " ");
//		}
		
		// seed
		Random generator1 = new Random(10);
		System.out.println("From gen1: ");
		for(int i=0; i<10; i++) {
			// [0, 1000)
			System.out.print(generator1.nextInt(1000) + " ");
		}
		
		Random generator2 = new Random(3);
		System.out.println("From gen2: ");
		for(int i=0; i<10; i++) {
			// [0, 1000)
			System.out.print(generator2.nextInt(1000) + " ");
		}
		
	}

}
