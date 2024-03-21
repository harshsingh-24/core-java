package oops2;

public class TestBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMI bmi1 = new BMI("Harsh Singh", 22, 145, 70);
		System.out.println("The BMI for " + bmi1.getName() + " is " + 
				bmi1.getBMI() + " " + bmi1.getStatus());
		
		BMI bmi2 = new BMI("Shubham", 12, 560, 900);
		System.out.println("The BMI for " + bmi2.getName() + " is " + 
				bmi2.getBMI() + " " + bmi2.getStatus());
	}

}
