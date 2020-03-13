import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {
	
	//create objects
	Address a   = new Address("King St", "Homer", "NY", 13077);
	Address a2  = new Address("King Road", "Homer", "NY", 13077);
	Customer c  = new Customer("nick", "Parker", "nick@gmail.com", a);
	Customer c2 = new Customer("nick", "Parker", "nick@gmail.com", a);
	Customer c3 = new Customer("dave", "witt", "dave@gmail.com", a2);
	
	@Test
	void testequals() {
		
		boolean real = c.equals(c2);
		boolean exp  = true;
		
		//run test
		assertEquals(real, exp);
		
		boolean real2 = c.equals(c3);
		boolean exp2  = false;
		
		//run test
		assertEquals(real2, exp2);
	}
	
	@Test
	void testclone() {
		
		Customer real = c3;
		Customer clone = new Customer(c3);
		
		//test identity
		assertFalse(real == clone);
		//test state
		assertTrue(clone.equals(c3));			
	}
	
	@Test 
	void getName() {
		
		String real = c.getName();
		String exp  = "nick Parker";
		
		//run test
		assertEquals(real, exp);
	}
	
	@Test
	void testgetEmail() {
		
		String real = c.getEmail();
		String exp  = "nick@gmail.com";
		
		//run test 
		assertEquals(real, exp);
	}
	
	
	
	
	
	
	
	
	
	

}

