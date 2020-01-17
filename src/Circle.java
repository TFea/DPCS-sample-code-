public class Circle { 	
	
	private double radius; // Hidden from outside this class, code outside wont be able to see or change the content of this variable
	private final double PI = Math.PI; // Final variables; values cannot be modified they are constant
	
	
	// Constructor  
	public Circle(double radiusGiven ) {  
		radius = radiusGiven;		  
	}
	
	//Constructor.
	public Circle() {  
		radius = 0.0;		  
	}
	
	//Mutated method - like a regular method w/o 'static', because they are instance method; acts directly on a field of an object created fromt this clas
	
	public void setRadius(double radiusGiven) { 
		radius = radiusGiven;		
	}
	
	//Accesor, get the value
	public double getRadius() {
		return radius;	
	}
	
	//Regular Method; returns area of the circle
	public double getArea() { 
		return PI * radius * radius;		
	}
	
	//Method to return radius * 2 
	public double getDiameter() { 
		return radius * 2;
	}
	
	public double getCircumference() { 
		return 2 * PI * radius; 
	}
	
	
	
	
	/**
	 * How class does it  
	 * 
	 * private double rad;
	 * private int x; 
	 * private int y;
	 * 
	 * 
	 * \\Constructors 
	 * public Circle(int r) {rade = r;}
	 * public Circle() {} 
	 * public Circle(int r, int x, int y) { 
	 * 		rad = r; 
	 * 		this.x = x; 
	 * 		this.y = y;
	 * 	}
	 * 
	 * 
	 * 
	 * 
	 * 
	 *\\ behaviours 
	 * public int getX() {return x; }
	 * public int getY() {return y; } 
	 * 
	 * public void setRadius(double r) { 
	 * 	if (r >= 0)
	 * 		rad = r; 
	 * 
	 * }
	 * 
	 * public void setX(int x) {this.x = x; }
	 * public void sety(int y) {this.y = y; } 
	 * 
	 * public void shrink(int scale) { 
	 * 		rad = rad / scale
	 * }
	 * 
	 * 
	 */
	
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
		
		
		
		
