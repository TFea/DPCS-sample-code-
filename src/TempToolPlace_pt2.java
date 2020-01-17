import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class TempToolPlace_pt2 { 
	
	public static int[] createRandomArray(int a, int b, int c) { 
	
	//Create an array of ints length a 
	// type [] name = new type[size];
		
		
	int [] arr = new int [a];
	
	for (int i = 0; i < arr.length; i = i + 1 ) { 
		
		int x = (int)(Math.random()*(c+1-b)+b);
		//Generating a random value
		arr [i] = b;  
		
		int[][] result = createRandom2DArray(5,7); 
		
		System.out.println(Arrays.toString(result));
	}
		
	return arr;	
		
	}
public static void main(String[] args) { 
	
	int [] result = createRandomArray(4,1,9); 
	System.out.println(Arrays.toString(result));
}


// an int with square brakets returns an array "int[]"
public static boolean foundElement(int [] a, int b) {
	//THIS IS A LINEAR SEARCH 
	
	for (int i = 0; i < a.length; i = i + 1) { 
		if (a[i] == b) { 
			return true; 
			
		}
	}
	
	return false; 
}

/**
 * This function should generate a random 2D array with dimensions [row] [column]  
 * and populate it with  random values from 0 to 99; It should return a refernce 
 * to the array 
 *@parum rows
 *@param columns 
 */

public static int [][] createRandom2DArray(int rows, int columns) { 
	
	int[][] arr = new int [rows][columns];
	//code loop
	
	for (int r = 0;r < arr.length; r = r + 1) {  
		 for (int c=0; c <arr[r].length; c++) { 
			 arr[r][c] = (int) (Math.random()*100); 
			
			 		 
		 }	
	} 
	return arr; 
	 
} 

public static void print2DRowMajor(int[][] arr) { 
	
	//It prints ow major because the rows are on the outside 
	for (int r = 0; r < arr.length; r = r + 1 ) { 
		for ( int c = 0; c < arr[r].length; c = c + 1) { 
			System.out.println(arr[r][c]);
		}
	}
	
}

public static int [][] HLP1NOV201714(){ 
	
	int [] values = {7, -3, 9, -1, -6, -5, 1};
	int [] rowc = {1, 1, 3, 3, 4, 7}; 
	int [] col = {0, 2, 2, 3, 4, 1, 4, 5,6};  
	
	//Ask: Write the algorithm that will 
	//	   take these three arrays and created the
	//	   resulting 2d array, When you run this
	//     it should return the 6 by 6 array given 
	//     in the question 
	
         return null;
	
	
} 


// random spiral square - numbers occuping 2d array in random integers every time
public static int [][] GenSpiralArray(int x, int y) { 
	
	
	int n = 5;
	int[][] spiral = new int[n][n];
	
	
	int z = 1; 
	int t = 0; 
	int b = n-1;  
	int r = n-1;  
	int l = 0;
	
	while (z <= n*n) { 
	
		for (int i = 0; i <= r; i++ ) =  {
			int 
		}
		
		
		
	}
		
	
	
	
	return null;
	
	
	
}
 
public static void Def (String[] args) { 
	
	Stack<String> stack1 = new Stack; 
	
	if (s.length() < 3) {
		return s;
		
	}
	
	
}






	
}
