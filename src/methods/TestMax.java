package methods;

public class TestMax {

	public static void main(String[] args) {
		
		int i = 5;
		int j = 2;
		int k = max(i, j); //black boxified the logic
		
		System.out.println("Max is: " + k);
		
	}
	
	public static int max(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		} 
		return num2;
	}
	
	
	

}
