package inheritanceAndPolymorphism;

public class TestMyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack myStack = new MyStack();
		GeometricObject object = new GeometricObject();
		
		myStack.push(1); // integer
		myStack.push(new Circle(2)); // circle
		myStack.push("Harsh singh"); // string
		
		System.out.println(myStack.toString());
		
	}

}
