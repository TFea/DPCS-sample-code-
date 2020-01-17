import java.util.ArrayList;

///////////////////////////////////// CLASS WORK NOVEMBER 29 2019///////////////////

public class ListDemo { 
	
	public static boolean isVowel(char c) {
		
		String t = "" + c; //cast c to a string. 
		t = t.toLowerCase();//converts string to lower case
		c = t.charAt(0); //instance method that takes first element of t and makes a char. 
		
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			
			return true;
		}
		
		
		return false;
		
	}

	
	
	
	public static void main(String[] args) { 
		
		// Reference type = Object types  (Constructing the array list)
		ArrayList<Integer> list = new ArrayList<Integer>();  
		 
		list.add(1);
		list.add(2); 
		list.add(3); 
		list.remove(1); 
		//list.add(1,9) - it shows the position of an int then adds it (position 1 new number will be 9) 
		//list.set(2,12) -  it finds the number at that position(2) then replaces it w/ new number (12) 
		//list.trimToSize90 -  it gets rid of unneccassry space in memory
		//list.remove(new Integer(3));// - removes integer 3 in array list
		//list.add(list.indexOf(4)); - gets the index of integer 4 in the array list
		int sum = 0;
		
		
		for (int i = list.size() - 1; i >= 0; i--) {
			if(list.get(i) == 2) {
				sum = sum + list.get(i);
				//list.remove(i);  
				
			} 
		}
		
		System.out.print(list);
		System.out.println(sum); 
		System.out.println(isVowel('i'));
		
		ArrayList<Character> vow = new ArrayList<Character>(); 
		
		//This is a nice test case since we have vowels by themselves and vowels in groups. 
		vow.add('W');
		vow.add('X');
		vow.add('A');
		vow.add('E');
		vow.add('I');
		vow.add('Q');
		vow.add('E');
		
		String vowels = ""; 
				//Arraylist is populated with random character 
				
		for (int i = vow.size() - 1; i >=0; i--) {
			
			if(isVowel(vow.get(i))) { 
				
				vowels = vowels + vow.get(i); 
				
				vow.remove(i);
				
				
			}
			
		}
		
		
		System.out.println(vow);
	}
	
}


