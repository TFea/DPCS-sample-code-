
public class Main {

	public static void main (String [] args) { 
		
		System.out.println(Tournament Selection()); 
			if string >= 20 then 
					
		
		
		
		
	} 
	
	public static int tournamentSelection() { 
		Scanner s = new Scanner(System.in);
		String[] games = {s.next (), s.next (), s.next (), s.next (), s.next (), s.next ()}; 
		int wincount = 0; 
		for (int = 0; i < games.length; i++) { 
			if (games [i].charAt((0) == W) { 
				wincount++; 
				
			}
		}
		
		if (wincount == 1 || wincount 2) { 
			return 3; 
		}
		else if (wincount == 3 || wincount 4) {
			return 2; 
		}
		else if (wincount == 5 || wincount 6) { 
			return 1;
		} else {
			return -1;
		}
	
}

}