import java.util.ArrayList;

public class EulerProject { 
	
	public static void main(String[] args) { 
	
		System.out.println(euler1(1000)); 
		System.out.println(euler2(4000000));
		
		
	}

   public static int euler1(int n) { 
		
		int count = 0; 
		
		for (int i = 0; i < n; i++) {
			if(i % 3 == 0) {
				count = count + i;
			}
			else if (i % 5 == 0) {
				count = count + i; 
			}
		 
	}

		   return count;
 } //end method
   
  public static void euler2(int max) { 
	  
	  //Step 1: Create an list 
	  ArrayList<Integer> list = new ArrayList<Integer>(); 
	  list.add(1); 
	  list.add(1); 
	  
	  int nTerm = list.get(0) + list.get(1); 
	  list.add(nTerm); 
	  
	  while (nTerm < max) { 
		  int len = list.size();
				nTerm = list.get(len - 1) + (len - 1);
					list.add (nTerm);
		  
	  }
	  
	  list.remove(list.size() - 1);  
	  	
	  
	  
	   
  }
   
   
   
   
   
   
    
} 
