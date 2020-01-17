import java.util.Scanner;
import java.util.Stack;


public class ClassWorkStacks { 
		
		public static void main(String [] args) { 
			
			
			//Creating a Stack 
			//REFERNCE TYPE = new OBJECT TYPE 
			Stack<String> s1 = new Stack<>();
			// Reference Type: It tells you what to expect 
			//				   when you follow the reference 
			//				   to the object. 
			//Object Type:    This is what you actually find 
			
			//Generally at the is stage the object type and refernce 
			// type match. Eventually they won't  
			Scanner s = new Scanner(System.in);
			Object os = new Scanner(System.in); // bad but valid 
			// Scanner so = new object (); //INVALID 
			
			s1.push("one");
			s1.push("two"); 
			s1.push("three"); 
			System.out.println(s1);
			s1.pop();
			System.out.println(s1);
			
		}
		
		/**
		 * 
		 * A stack S has an unknown number of strings. Write pseudocode
		 * to output the alphabetically smallest  value. The stack must 
		 * be left unchanged at the end.  
		 * @parum s
		 * 
		 */
		
		public static void findSmallest(Stack<String>s) { 
			
		}
		
		if 
		}

}