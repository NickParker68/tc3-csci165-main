import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	//create object
	Temperature temp  = new Temperature();
	Temperature temp2 = new Temperature();
	Temperature temp3 = new Temperature();
	Temperature temp4 = new Temperature();
	
	@Test
	void testsetTemp() {
		double t = temp.setTemp(43.2);
		
		double desired = 43.2;
		double real    = t;
		
		//run test
		assertEquals(desired, real);
		
	} //end of testsetTemp
	
	@Test
	void testgetTempC() {
		double t = temp2.setTemp(44.3);	
		temp2.setCF("f");
		
		double desired = 6.8;
		double real = temp2.getTempC(t);
		
		//run test
		assertEquals(desired, real);		
		
	}
	
	@Test
	void testequals() {
		double t = temp3.setTemp(0);
		temp3.setCF("c");
		double t2 = temp4.setTemp(32);
		temp4.setCF("f");
		
		boolean desired = true;
		boolean real    = temp4.equals(temp3);
		
		//run test
		assertEquals(desired, real);		
		
	} //end of equalstest

}
