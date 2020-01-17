import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class StackFileAccess { 
//1. Reference Type 
//2.Stacks 
//3. Try Catch
//4.Scope - where a variable is accessible 
// 			We define the scope of a a variable from the  
//	        proceding brace to its pair 
// 
//  	{ 
// 			int
// 
// 
// 
// 
// 
// 

	public static void main (String[] args) { 
		
		Stack<Integer> stack1 = readToIntStack("dataInt.txt"); 
		System.out.println(stack1); 
		Stack<Integer> stack2 = new Stack<Integer>(); 
		
		int r = (int)(Math.random()*100); 
		
		for(int i = 0; i < r; i++) { 
			int v = (int)( Math.random()*100); //Error 
					stack2.add(v);
		} 
		
		writeIntStackToFile(stack2, "dataInInt.txt"); 
		System.out.println(stack2); 
	
	}
	
		public static void writeIntStackToFile(Stack<Integer> stack, String file) { 
			
			try { 
				
				File f = new File(file); 
				FileWriter fw = new FileWriter(f); 
				PrintWriter pw = new PrintWriter(fw); 
				
				int size = stack.size(); 
				
				for (int i = 0; i < size; i = i + 1) { 
					pw.println(stack.get(i));
				}			
				
			}
			catch (Exception e) { 
				
				System.out.println("ERROR WRITE INTO TO STACK TO FILE");
				
			}			
		}
		
		
		
		
	

	
	
	/**
	 * 
	 * This method takes a string that represents a file name. 
	 * It copies the content of the file into a stack and returns 
	 * the stack. If the file is bad, null is returned
	 * @param file
	 * @return
	 */
	
private static Stack<Integer> readToIntStack(String file) { 
	
	try { 
		File f = new File(file); 
		Scanner s = new Scanner(f); 
		
		Stack<Integer> stack = new Stack<Integer>(); 
		
		while(s.hasNext()) { 
			stack.push(s.nextInt()); 
		}
		return stack;	
		} 
	catch (Exception e) { 
		System.out.println("FILE NOT FOUND");		
		} 
	
	return null;
	
	}
	
	
	
	
	
	



}
	
	
	
	

