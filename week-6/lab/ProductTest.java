import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {
	
	//create object
	Product product1 = new Product("Nick", "test", "4", 4.0);
	Product product2 = new Product("Nick", "test", "4", 4.0);
	Product product3 = new Product("Dave", "test", "4", 4.0);
	Product product4 = new Product("Nick", "Test", "4", 4.0);
	
	

	@Test
	void testEquals() {
		
		boolean real = product1.equals(product2);
		boolean exp = true;
		
		//run test
		assertEquals(exp, real);			
	}
	
	@Test 
	void testEquals2() {
		
		boolean exp = false;
		boolean real = product1.equals(product3);
		
		//run test
		assertEquals(exp, real);
	}
	
	@Test 
	void testgetName() {
		
		String real = product1.getName();
		String exp = "Nick";
		
		//run test
		assertEquals(exp, real);
	}	
	
	@Test
	void testgetPrice() {
		
		double real = product1.getPrice();
		double exp  = 4.0;
		
		//run test
		assertEquals(exp, real);
	}
	
	
	@Test 
	void testClone() {
		
		Product real = product1;
		Product clone = new Product(product1);
		
		//verify identity
		assertFalse(real == clone);
		//verify state
		assertTrue(clone.equals(real));					
	}
}


