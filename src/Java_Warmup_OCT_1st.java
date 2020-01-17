import java.util.Arrays;

public class Java_Warmup_OCT_1st {



public static void main(String [] args) {  
	
	int a[] = new int [5]; // Creates an array length 5 indexes 0-4
	//BT; Numeric Types are defaults to 0
		
		a[0]= 10;
		a[1]= 20;		
		a[2]= 30;
		a[3]= 40; 
		a[4]= 50; 
		
		// or int[] b = {1,2,3,4,5} //Quick way to populate array
		System.out.println(a);
		
		for (int i = 0; i < a.length; i = i + 1) { 
			System.out.println(a[i]); 
		} 
		
		for (int i = a.length - 1; i >= 0; i = i - 1) { 
			
		}
		
		//FOR EACH LOOP - Dont use if you are removing things
			for (int n: a) { 
				System.out.println(n); 
				
			} 
			
		// Really nice shortcut 
		// to string is an overloaded method. 
		// this means that they are multiple versions that have 
		// different parameters the program knows which one to pick based on the parameters
			System.out.println(Arrays.toString(a)); 
			//BT; You mus t be very careful when writing methods that 
			//have a reference type parameters. If you change the 
			// parameter the change is permanent
			doThis(a); 
			System.out.println(Arrays.toString(a)); 
			
			
} 


	/**
	 * 
	 * @param n 
	 * post-condition: n is changes
	 */
	public static void doThis(int [] n) { 
		n[0] = 99;
	}

}

