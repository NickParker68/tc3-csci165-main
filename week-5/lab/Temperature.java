
public class Temperature{
	
	private double temp;
	private double degreesF;
	private double degreesC;
	
	
	public Temperature(){} //no argument constructor
			
	public double setTemp(double temp) {
		
		return temp;
		
		} //end of setMonth
	
	public double setCF(String scale) {
		
		char Char = scale.charAt(0);
		int ascii = (int) Char;
		
		//if to determine celsius or farenheit
		if (ascii == 102) {
			// make temp farenheit
			return temp = degreesF;			
		} //end of if
		else {
			// make temp celsius
			return temp = degreesC;			
		} //end of else				
		
	} //end of setCF
	
	public double setBoth(double temp, char scale) {
		
		int ascii = (int) scale;
		
		//if to determine celsius or farenheit
		if (ascii == 102) {
			// make temp farenheit
			return temp = degreesF;			
		} //end of if
		else {
			// make temp celsius
			return temp = degreesC;			
		} //end of else							
		
	} //end of setTemp&scale	
			
	public void getTempC(double degreesF) {
		// convert temp
		double DegreesC = (5*(degreesF - 32))/9;
		// round to one decimal place
		System.out.format("%.1f", DegreesC);			
		
	} //end of getTempC
	
	public void getTempF(double degreesC) {
		// convert temp
		double DegreesF = ((9*degreesC)/5) + 32;
		// round to one decimal place
		System.out.format("%.1f", DegreesF);		
		
	} //end of getTempF
	
	public boolean equals(Temperature t) {
		
		return this.degreesC == t.degreesF &&
			   this.degreesF == t.degreesC;
		
	} //end of equal
	
	int compareTo(Temperature t) {
		
		if (this.degreesC >= t.degreesF) {
			return 1;
		} //end of if
		else if (this.degreesF >= t.degreesC) {
			return -1;
		} //end of else if
		else {
			return 0;			
		} //end of else
		
	}
	
	
	//public String toString() {
		
		
	//} //end of toString
	
	
	
	 
	

} //end of class
