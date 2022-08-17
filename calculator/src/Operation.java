
public class Operation {
	
	public int calcul (String input) {
		Integer rezultat = 0;
		
		
		if(input.contains("+")) {
			String [] output = input.split("\\+");
			
			int valoare1 = Integer.parseInt(output [0]);
			int valoare2 = Integer.parseInt(output [1]);
			
			rezultat = adunare (valoare1, valoare2);
		}
		if(input.contains("-")) {
            String [] output = input.split("\\-");
       
		    int valoare1 = Integer.parseInt(output [0]);
			int valoare2 = Integer.parseInt(output [1]);
	
			rezultat = scadere (valoare1, valoare2);
		}
		if(input.contains("x")) {
			 String [] output = input.split("x");
		       
			 int valoare1 = Integer.parseInt(output [0]); 	
			 int valoare2 = Integer.parseInt(output [1]);
	
			rezultat = inmultire (valoare1, valoare2);
		}
		if(input.contains("/")) {
			String [] output = input.split("\\/");
		       
		    int valoare1 = Integer.parseInt(output [0]);
			int valoare2 = Integer.parseInt(output [1]);
			
			if((valoare1 != 0) && (valoare2 != 0)) {
				rezultat = impartire (valoare1, valoare2);
			}	
		}
	
		return rezultat;
	
	}
	
	private int adunare (int val1, int val2) {
		
		return val1 + val2;
	}
	
	private int scadere (int val1, int val2) {
		return val1 - val2;
	}
	
	private int inmultire (int val1, int val2) {
		return val1 * val2;
	}
	
	private int impartire (int val1, int val2) {
		return val1 / val2;
	}

}
