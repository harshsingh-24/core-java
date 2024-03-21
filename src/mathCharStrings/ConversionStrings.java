package mathCharStrings;

public class ConversionStrings {

	public static void main(String[] args) {
		
		// 1. String to Number "123456" (Integer.parseInt(string)) [java.lang]
		// Integer and Double are Wrapper classes of data types int and double.
		
		int intValue = Integer.parseInt("123456");
		System.out.println(intValue);
		
		double doubleValue = Double.parseDouble("123456.6373");
		System.out.println(doubleValue);
		
		// 2. Number to String
		
		int number = 65474834;
		String s1 = number + ""; // string concat opeartor
		System.out.println(s1);
		System.out.println(s1.length());
		
	}
	
}
