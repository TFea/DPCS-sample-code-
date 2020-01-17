//A class is a "blueprint" an object is an instance of the class. 
//The blueprint to build a bike us the class, a bike is an object 
//You can make as many objects from a class as you want
public class Fraction { 
	
	//Attribute/Fields 
	// You should always make fields private 
	// This means they cannot be accepted 
		//suggestion: never use the same vernal 4 name
	private static int FractionCount = 0; 
	private int num;
	private int den;

	//Constructors  
	//IF NO CONSTRUCTORS IS WRITTEN A DEFAULT CONSTRUCTOR
	//EXISTS -  TAKES NO PARAMETERS SETS 
	//NUMERIC = 0
	//BOOLEANS = FALSE
	//REFERENCE TYPES = NULL 
	
	//CONSTRUCTORS ARE SPECIAL INSTANCE METHODS THAT ARE ONLY
	//CALLED ONCE AT A TIME OF CONSTRUCTION
	// A CONSTRUCTOR DOES NOT INDICATE A RETURN TYPE 
	// A CONSTRUCTOR MUST BE PUBLIC 
	// A CONSTRUCTOR IS ALWAYS NAMED USING THE CLASS NAME
	
	public Fraction (int n , int d) { 
		
	num = n; 
	if (d != 0) { 
		den = d; 
	}
	else { 
		den =1;
		
	   }
		
	}
	
	
	
	
	//Behaviours        
	               
	public static Fraction createNewFraction( Fraction)
	
	
	
	//Accessors(Get) Methods 
	public int getNum() {return num ;} 
	public int getDen() {return num ;}
	public int getFractionCount() {return fractionCount; }
	
	
	
	
	
	
	
	public void reduce() { 
		
		int gcf = 1;
			
		for (int i = 2; i < Math.min(this.num, this.den); i++) 
			if (this.num%1 == 0 && this.den%1 == 0) {
				gcf = 1;
		
		
	}


// Step 2: Divide num and den by gdd

	this.num = this.num /  gcf;
	this.den = this.den /  gcf;  
	

	}
	
	public void scale (int a) { 
		num = num * num;
		
		
	}
	
 public void setReciprocal () { 
	 
	 if (this.num !=0 && this.den !=0) { 
		 
		int a = this.num; 
		int b = this.den;  
		
		this.num = a;
		this.den = b;	
		 
		 
		 
	 }
	 
	 
	 
 }
	
	
	
	
}
	