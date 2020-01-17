import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TempToolPlace {
	   
	public static void main(String[] args) { 
		
		printMatrix (4,5);
		
		//test1_3_6 (6); 
		
	}
	
	// void returns nothing 
	
	/**
	 * This method takes an int then compares it to k and prints out k until input is equal to k. returns nothing. 
	 * @param n
	 */ 
	
	public static void test1_3_6(int n) { 
		
		int k = 1;
		// loop while k <= n
		while (k <= n) {  
			
			System.out.println(k);  

			k = k + 1;			
			
		}
		
	} //END TEST1_3_6 
	
	/**
	 *  
	 */
	
	
	public static void printMatrix(int r, int c) {
		
		for (int i = 1;i < r; i++) { 
			
			// makes it so there is no empty line above 
			
			if (i != 1) {
			
			// makes it so each set of numbers goes to a new line bellow		
				System.out.println(""); 
			} 
			
			for (int a = 1;a < c; a++)  {  
				
				// (a + " ") makes a space between each number 
				
				System.out.print(a + " ");
				
				
			}
			
		}
		
		
		
		
		
		
		
	}
}
