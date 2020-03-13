public class Customer {
	
	String firstName;
	String lastName;
	String email;
	Address Address;	
	
	public Customer(){}		//no argument constructor
	
	public Customer(String firstName, String lastName, String email, Address Address) {
		this.firstName = firstName;
		this.lastName  = lastName;
		this.email     = email;
		this.Address   = Address;		
	}
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName  = lastName;
		
	}
	
	//copy constructor
	public Customer(Customer toClone) {
		this.firstName = toClone.firstName;
		this.lastName  = toClone.lastName;
		this.email     = toClone.email;
		this.Address   = toClone.Address;		
	}

	public void setName(String first, String last) {
		this.firstName = first;
		this.lastName  = last;				
	}
	
	public String getFirst() {
		return firstName;		
	}
	
	public String getLast() {
		return lastName;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public String getEmail() {
		//check for @ symbol
		if (email.contains("@")) return email;
		else { this.email = "none on file";
		return "invalid email";}
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean equals(Customer otherCustomer) {
		return this.firstName.equals(otherCustomer.firstName)  &&
			   this.lastName.equals(otherCustomer.lastName)    &&
		       this.email.equals(otherCustomer.email)          &&
		       this.Address.equals(otherCustomer.Address);		
	}

	@Override
	public String toString() {
		return "Customer: " + firstName + " " + lastName + ", email: " + email + ", Address: "
				+ Address;
	}
	
	

}

	
