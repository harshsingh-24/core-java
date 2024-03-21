package oops;

public class TestStackOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackOfIntegers stack = new StackOfIntegers();
		
		for(int i=0; i<500; i++) 
			stack.push(i);
		
		while(!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		
	}

}
