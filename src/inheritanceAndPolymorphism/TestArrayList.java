package inheritanceAndPolymorphism;

import java.util.ArrayList;

public class TestArrayList {
	
	public static void main(String[] args) {
	
		ArrayList<String> cityList = new ArrayList<>();
		
		// Add cities to the list
		cityList.add("London");
		cityList.add("Rome");
		cityList.add("Venice");
		cityList.add("Zurich");
		cityList.add("Milan");
		cityList.add("Paris");
		
		System.out.println("Size: " + cityList.size());
		System.out.println("Rome? " + cityList.contains("Rome"));
		System.out.println("Is Empty? " + cityList.isEmpty());
		System.out.println("Index of Zurich: " + cityList.indexOf("Zurich"));
		
		// Insert a city at index 2
		cityList.add(2, "Amsterdam");
		
		// Remove an element
		cityList.remove("Paris");
		// Remove at index
		cityList.remove(1);
		
		// Display the contents
		System.out.println(cityList.toString());
		
		for(int i=cityList.size() - 1; i>=0; i--) {
			System.out.println(cityList.get(i) + " ");
		}
		System.out.println();
		
		
		// Create an array list of circle
		ArrayList<Circle> list = new ArrayList<>();
		list.add(new Circle(2));
		list.add(new Circle(3));
		
		System.out.println("Area: " + list.get(0).getArea());
	}
}
