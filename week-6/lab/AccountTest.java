import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {
	
	//create objects
	Address a   = new Address("King St", "Homer", "NY", 13077);
	Customer c1 = new Customer("nick", "Parker", "nick@gmail.com", a);
	Customer c2 = new Customer("dave", "witt", "dave@gmail.com", a);
	Account a1 = new Account(12, c1, 11.00, 20.00);
	Account a2 = new Account(12, c1, 11.00, 20.00);
	Account a3 = new Account(11, c2, 12.00, 22.00);

	@Test
	void testEquals() {
		
		boolean real = a1.equals(a2);
		boolean exp  = true;
				
		//run test
		assertEquals(real, exp);
		
		boolean real2 = a2.equals(a3);
		boolean exp2  = false;
		
		//run test
		assertEquals(real2, exp2);
		
		
	}

}
