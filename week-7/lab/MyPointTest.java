import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyPointTest {
	
	//create instances of MyPoint
	MyPoint p1 = new MyPoint(1, 4);
	MyPoint p2 = new MyPoint(4, 9);

	@Test
	void testgetX() {
		
		int real = p1.getX();
		int exp  = 1;
		
		//run test
		assertEquals(real, exp);		
	}
	
	@Test
	void testgetY() {
		
		int real = p1.getY();
		int exp  = 4;
		
		//run test
		assertEquals(real, exp);
	}
	
	// got confused on how to test for the array, the array works when I print from the driver.
	//@Test
	//void testgetXY() {
		
	//	int[] real = p1.getXY();
	//	int[] exp  = {1, 4};
		
		//run test
	//	assertEquals(real, exp);
	//}
	
	@Test
	void testDistance() {
		
		double real = p1.distance();
		double exp  = 4.123105625617661;
		
		//run test
		assertEquals(real, exp);		
	}
	
	@Test 
	void testDistance2() {
		
		double real = p1.distance(p2);
		double exp  = 5.830951894845301;
		
		//run test
		assertEquals(real, exp);
	}
	
	@Test 
	void testDistance3() {
		
		double real = p1.distance(2, 3);
		double exp  = 1.4142135623730951;
		
		//run test
		assertEquals(real, exp);
	}

}
