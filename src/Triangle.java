public class Triangle { 
	
	private double side1; 
	private double side2; 
	private double side3;
	private double Height =  Math.sqrt(side3/ 2);
	
	
	// Constructor
	public Triangle(double side1, double side2, double side3) { 
	
	}

	// Accesor
	public double getSide1() { 
		return side1; 		
	}
	
	public double getSide2() { 
		return side2; 	
	}
	
	public double getSide3() { 
		return side3; 	
	}
	
	public double getArea() { 
		return side3 * Height /2;	
	}
	
	public double getPer() { 
		return side1+side2+side3; 		
	}
	
	
	
	
}
