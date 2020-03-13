import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Driver {

	public static void main(String[] args) {		
		//create instance of product
		Product product = new Product("Nick", "Hat", "4", 4.0);
		Address a = new Address("King St", "Homer", "NY", 13077);
		Customer c = new Customer("nick", "Parker", "nick@gmail.com", a);
		Account account = new Account(6, c, 0.0, 0.0);
		
		String e = c.getEmail();
		System.out.println(e);
		
		System.out.println(product);
		
		System.out.println(c);
		
		System.out.println(account);
		
		
		
		
		
		
		

	}

}
