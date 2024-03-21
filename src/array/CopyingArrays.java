package array;

public class CopyingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] sourceArray = {2, 3, 1, 5, 10};
		int[] targetArray = new int[sourceArray.length]; // 0
		
		System.out.println("Before: ");
		System.out.println(sourceArray[2]); // 1
		System.out.println(targetArray[2]); // 0
		
		// 1. Through loops
//		targetArray = sourceArray;

//		
//		for(int i=0; i<sourceArray.length; i++) {
//			targetArray[i] = sourceArray[i];
//		}
		
		// 2. arrayCopy method
		
		System.arraycopy(sourceArray, 0, targetArray, 0, 5); //0, 1, 2, 3, 4 -> 2, 3, 4, 5, 6
		
		for(int i=0; i<targetArray.length; i++) 
			System.out.print(targetArray[i] + " ");

		
		sourceArray[2] = 10000;
		
		System.out.println("After: ");
		System.out.println(sourceArray[2]); // 10000
		System.out.println(targetArray[2]); // 1
		
	}

}
