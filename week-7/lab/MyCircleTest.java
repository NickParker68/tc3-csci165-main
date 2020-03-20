import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyCircleTest {
	
	//create instances of MyPoint and MyCircle
	MyPoint p1 = new MyPoint(1, 4);
	MyPoint p2 = new MyPoint(4, 9);
	
	MyCircle c1 = new MyCircle(p1, 4);
	MyCircle c2 = new MyCircle(p2, 6);

	// could not figure out how to test, works in driver
	//@Test
	//void testgetCenter() {
		
	//	MyPoint real = c1.getCenter();
	//	MyPoint exp  = (1, 4);
		
		//run test
	//	assertEquals(real, exp);		
	//}
	
	@Test 
	void testgetCenterX() {
		
		int real = c1.getCenterX();
		int exp  = 1;
		
		assertEquals(real, exp);
	}
	
	@Test
	void testgetCenterY() {
		
		int real = c1.getCenterY();
		int exp  = 4;
		
		assertEquals(real, exp);
	}
	
	@Test
	void testgetRadius() {
		
		int real = c1.getRadius();
		int exp  = 4;
		
		//run test
		assertEquals(real, exp);		
	}
	
	@Test
	void testgetArea() {
		
		double real = c1.getArea();
		double exp  = 50.26548245743669;
		
		//run test 
		assertEquals(real, exp);
	}
	
	@Test
	void testgetCircum() {
		
		double real = c1.getCircumference();
		double exp  = 25.132741228718345;
		
		//run test
		assertEquals(real, exp);		
	}
	
	@Test
	void testDistance() {
		
		double real = c1.distance(c2);
		double exp  = 5.830951894845301;
		
		//run test
		assertEquals(real, exp);
	}
	
	
}
