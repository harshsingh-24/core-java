package methods;

public class TestMethodReturnTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The grade is: " + getGrade(78.0));

		System.out.println("The grade is: " + getGrade(59.5));
		
	}
	
	public static char getGrade(double score) {
		
		if(score >= 75.0) {
			return 'A';
		} 
		
		return 'D';
		
	}

}
