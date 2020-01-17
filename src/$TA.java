import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class $TA {  
	
	public static void main(String[] args) { 
		
		
		String[] arrStr1 = {"cat","dog","fish", "apple"};
		String minStr1 = findAlphaSmallest(arrStr1); 
		System.out.println(minStr1);
			
		
		
	
		//Variable to use 
		int [] arr = {23,12,89};
		int [] arr2 = {2,12,89}; 
		System.out.println(findArrayDigitSum(arr)); 
		System.out.println(findArrayDigitSumSTR(arr2)); 
		System.out.println(Arrays.toString(inputIntArray()));
		

		  int x = base2to10A(1011); 
		  System.out.println(x); 
		  x = base2to10A(0); 
		  System.out.println(x); 
		  
		
	} //end main
	
	
	public static void print(String s) {
		
		System.out.println(s); 
	}// end print
	
	/**
	 * This takes two stings a and b and returns a + b
	 * @param a
	 * @param b
	 * @return 
	 * 
	 * pre-conditions - a and b are valid strings 
	 * postconditions  - no post conditions
	 * 
	 */
	public static String addStrings(String a, String b) {
		
		return a + b;
	} //end addString
	
	public static int base2to10A(int n) { 
		int pwr = 0; 
		int r = 0; 
		

		while (n > 0) {
			
			int x = n % 10; 
			n = n / 10; 
			
			r = r + x * (int)Math.pow(2, pwr);
			
			pwr = pwr + 1; 
			
		} 
		
		return r; 

	}
		
	
	public static int base2To10B(int n) {
		
		/*
		 * Convert to a string instead of using the mod int div process			 *
		 */ 
		//convert n into a string? 
		String value = "" + n;
		int pwr = 0; 
		int r = 0;  
		
		//Bread and butter algorithm: looping through a string and accessing
		//each element. Looping through sting or array in reverse 
		
		for (int i = value.length() - 1; i >= 0; i = i - 1) {
			
			//Step 1:access the right most digit cast to int
			int x = Integer.parseInt(value.substring(i, i + 1));  
			
			
			r = r + (int)Math.pow(2,pwr) * x;
			pwr = pwr + 1;
			
		}
		
		return r;
		
		
	} 
	
//START
//********************************Class Work (MOnday Septemeber 30th (P2)********************************* 
	public static int base10toBase2 (int n) { 
		String r = "";
				
		while (n > 0) {
		
			int x = n%2; 
			n = n / 2; // This is integer division 
			r = x + r; 
		
		} 
			
		return Integer.parseInt(r);
	
	
	} 
	// changing type is called "casting"  
	// In Java (and all languages) there are "shortcuts", 
	
	
	//START 
	// *******************************CLass Work (Thursday, October 10th (P2)**********************************
	
	/**
	 * This function takes an array of integers and returns
	 * the sum of the digits 
	 * @parum a  
	 * @return 
	 * 
	 * pre-condition: All elements are 2 digit in length 
	 * post-condition: a is not changed when the function is done
	 */ 
	
	public static int findArrayDigitSum(int [] a) {  
		
		//I WILL MAKE A VIDEO SOLUTION TO THIS.	
		int sum = 0;
		
		//loop through array
		for (int i = 0; i < a.length; i = i +1) { 
			
			int temp = a[i]; // ASSIGNMENT STATEMENT
			int n1 = temp%10; 
			int n2 = temp/10; //JAVA SPECIFIC INT/INT --> INT DIVISION 
			sum = sum + n1 + n2;
		    // Int are 32 bit while doubles are 64 bit
			
		}
		
		
		return sum;  
		
	} //end findArrayDigitSum
	
	/**
	 * This function takes and a array of intgers and returns 
	 * the sum of the digits. This is an alternative implementation 
	 * that treats the digit as a string  
	 * @param a
	 * @return
	 */
	
	public static int findArrayDigitSumSTR(int[] a) {  
		
		int sum = 0; 
		
		for (int i = 0; i < a.length; i = i + 1) {
			
			//CASTING - Process of changing type 
			String temp = ""+ a[i];
			String n1 = temp.substring(0,1); 
			
			String n2 = "0";
			
			if (temp.length() > 1) {
				n2 = temp.substring(1,2); 	
			}
			
			sum = sum + Integer.parseInt(n1) + Integer.parseInt(n2); //SELF REFERNCING ASSIGNMENT STATMENT sum = sum
			
		}
		
		return sum; 	
		
	} //end findArrayDigitSumStr  
	
	
	
	
	/**
	 * Takes a single int that sets the size of an array
	 * Takes all integer inputs. Returns the array
	 * @return
	 */		
	public static int[] inputIntArray() { 
		
		//STEP 1: create Scanner  
		Scanner s = new Scanner(System.in); 
		
		System.out.print("How many elements: ");
		int n = s.nextInt(); // INSTANCE METHOD, called with instance s  
		
		int [] result = new int [n]; 
		
		for (int i = 0; i < n; i = i + 1) { 
			System.out.print("Input value: "); 
			result[i] = s.nextInt();
			
		} 
	
		return result;
		//Extension Suggestion: 
		// - Create a method that randomly genertaes an aarry of ints 
		// - Create a version that takes another type 
		// - Create a  version where the size is passed as a parameter 
		// - Create a version where you have an upper and lower parameter that restricts inputs
		
	}
		
		
		
	
	////////////////////////////CLASS WORK TUESDAY OCOTOBER 15 2019///////////////////////////////////
	
	/**
	 * This function takes an array of strings and finds the largest value
	 * alphabetically, If the array is empty the function returns null
	 * @param s
	 * @return 
	 * 
	 * preconditon: The array can be any length
	 * postcondition:The arrai is left unchnaged
	 */

	
public static String findAlphaSmallest(String [] s) {  
		
		//Bad- WORKS BUT VIOLATES POST CONDITION
		//Arrays.sort(s);
		//return s[0]; 
	
	String min = s[0];
	
	for (int i = 0; i < s.length; i = i + 1) { 
		if(s[i].compareToIgnoreCase(min) < 0) {
			min = s[i];
				}
			}
		return min;
				}
		
		
	
	
	public static void main(String[] args) { 
		
	
		String[] arr = {"cat","dog","fish", "apple"};
				String min = findAlphaSmallest(arr); 
				System.out.println(min); 
				
				System.out.println("cat".compareToIgnoreCase("dog")); 
				System.out.println("dog".compareToIgnoreCase("dog")); 
				System.out.println("dog".compareToIgnoreCase("cat")); 
			
		}
	
	
	public static void reverseQueue(Queue<String> q) { 
		
		Stack<String> s = new Stack <String>(); 
		//Empty the queue and fill up the stack
		while (!q.isEmpty()) { 
			s.push(q.remove()); 
			
		}
	}
	
public static void main (string [] args) { 
	
	Queue<String> q1 = new LinkedList<>();
	q1.add("one");
	q1.add("two");
	q1.add("three"); 
	System.out.println(q1); 
	reverseQueue(q1);  
	System.out.println(q1); 
	
}
	
	
	
	
	
	
} //end class
	
/**
 * This tool sorts colors in order from smallest RBG value to largest RBG value
 * @param args
 */
	
public static void SortColours(String [] args) { 
	
	System.out.println("anchors unsorted: " + Arrays.toString(allAnchorColors));
	Arrays.sort(allAnchorColors) ;
	System.out.print("anchors sorted: " + Arrays.toString(allAnchorColors)); 
	
	

	public static void reverseQueue(Queue<String> q) { 
		
		Stack<String> s = new Stack <String>(); 
		//Empty the queue and fill up the stack
		while (!q.isEmpty()) { 
			s.push(q.remove()); 
			
		}
	}
	
public static void main (string [] args) { 
	
	Queue<String> q1 = new LinkedList<>();
	q1.add("one");
	q1.add("two");
	q1.add("three"); 
	System.out.println(q1); 
	reverseQueue(q1);  
	System.out.println(q1); 
	
}

}

	
}


		
	 


	