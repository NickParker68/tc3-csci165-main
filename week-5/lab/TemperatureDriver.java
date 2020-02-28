
public class TemperatureDriver {

	public static void main(String[] args) {
		
		Temperature temp1 = new Temperature();
		Temperature temp2 = new Temperature();
		Temperature temp3 = new Temperature();
		
		
		//temp1 instance tests
		double t1 = temp1.setTemp(23.4);
		temp1.setCF("f");
		temp1.getTempC(t1);
		
		System.out.println();
		
		//temp2 instance tests
		double t2 = temp2.setTemp(-4.8);
		temp2.setCF("c");
		temp2.getTempF(t2);
		
		System.out.println();
		
		//temp3 instance test
		double t3 = temp3.setTemp(7.9);
		temp3.setCF("f");
		temp3.getTempC(t3);
		
		
		//testing public boolean equals
		System.out.println(temp1.equals(temp2));
		System.out.println(temp2.equals(temp3));
		
		//testing compareTo
		System.out.println(temp1.compareTo(temp3));
		System.out.println(temp2.compareTo(temp1));
		System.out.println(temp3.compareTo(temp1));
		
		
		
		
		

	}

}
