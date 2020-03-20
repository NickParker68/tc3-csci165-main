import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CylinderTest {
	
	//create instances
	MyPoint p1 = new MyPoint(1, 4);
	MyCircle c1 = new MyCircle(p1, 5);		
	
	//get radius of circle
	int radius = c1.getRadius();
	
	//instance of cylinder
	Cylinder cylinder = new Cylinder(p1, radius, 8.2);

	@Test
	void testgetHeight() {
		
		double real = cylinder.getHeight();
		double exp  = 8.2;
		
		assertEquals(real, exp);			
	}
	
	@Test
	void testgetVolume() {
		double real = cylinder.getVolume();
		double exp  = 644.0264939859076;
		
		assertEquals(real, exp);
	}
		

}
