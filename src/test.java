import java.util.Scanner;



public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		giveString();
		
		
	}
	
	/** 
	 * This method takes an input of a string, using a scanner then it outputs the same string that the user inputed
	 * key take away the sanner tool
	 * 
	 * 
	 */
	public static void giveString () {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Type a string: ");
		String in = input.next();
		
		System.out.println(in);
		
		
		
	} 
	
	

		/** 
		 * This method takes and input of an interger than outputs the same int that the user inputted
		 * @param args
		 */
	public static void main(String[] args) { 
		
		// Commenrs are placed in green
		Scanner s  =  new Scanner (System.in); // reads from keyboard
		int num = 0; // declares 
		System.out.print("Input a number:"); // prints to screen 
		num = s.nextInt(); // waits for user to enter number and press enter  
		System.out.println("You entered: "+num);  
		string = s.next();
		
		
	
	
} 
}
