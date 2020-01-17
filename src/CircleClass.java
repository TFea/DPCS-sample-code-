import javax.swing.JOptionPane;

public class CircleClass { 
	
	public static void main (String [] args) { 
		
		String userInputString;
		double userRadius; // Going to store the the result of what userInputString turns into double
		
		//uses JOptionPane used to display info. but system.out.println to print 
		userInputString = JOptionPane.showInputDialog("Please eneter circle's radius: "); 
		userRadius = Double.parseDouble(userInputString); // userInputString is being parsed into a double
		
		
		//Creating a circle object, from Circle class. Hold the reference address
		
		Circle circle1 = new Circle(userRadius); 
		
		
		/*
		 * This is for manualy going in and changing the radius, since it is private 
		 * only works if the parse??? in the method above aint working
		 * circle1.setRadius(userRadius); 
		 * 
		 */
		
		JOptionPane.showMessageDialog(null, "Area:  " + circle1.getArea() + "\nDiameter: " + circle1.getDiameter() + 
									   "\nCircumference: " + circle1.getCircumference()); // "\n" Creates a new line wherever it is placed
		
		
		System.exit(0); // Anytime JOptionPane is used an extra thread is started, so you have to terminate with System.exit() use 0 to confirm that it runs succesfully
		
	}
	

}
	
		
/*
 * 
 * Circle Class 
 * 
 * 
 * Circle class that has the following fields  
 * 
 * - radius: a double 
 * - PI: a final double inittialized with the value 3.14159
 * 
 * The class should have the following methods: 
 * 
 * - Constructor; Accepts the radius of the circle as an argument. 
 * - Constructor; A no - argument constructor that sets the radius field to 0.0
 * - setRadius; A mutator method for the radius field
 * - getRadius; An accessor method for the radius field. 
 * - getArea; Returns the area of the circle, which is a calculated as  area = PI * radius * radius 
 * - getDiameter; Returns the diameter of the circle, which is calculated as diameter = radius * 2
 * - getCircumference; Returns the circumference of the circle, which is calculated as circumference = 2 * PI * radius 
 * 
 * Write a program that demonstrates the Circle class by asking the user for the circle's radius, creating a Circle object, 
 * and then reporting the circle's area, diameter, and circumference 
 * 
 * 
 */
		
		
		
		
