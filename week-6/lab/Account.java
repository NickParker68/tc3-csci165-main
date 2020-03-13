public class Account {
	
	int accountID;
	double balance       = 0.0;
	double creditLimit   = 0.0;
	double discountLevel = 0.0;
	Customer customer;
	Date dateCreated;
	
	public Account() {} //no argument constructor
	
	public Account(int accountID, Customer customer) {
		this.accountID = accountID;
		this.customer  = customer;
	}
	
	public Account(int accountID, Customer customer, double balance, double creditLimit) {
		this.accountID   = accountID;
		this.customer    = customer;
		this.balance     = balance;
		this.creditLimit = creditLimit;
	}
	
	//copy constructor
	public Account(Account toClone) {
		this.accountID     = toClone.accountID;
		this.balance       = toClone.balance;
		this.creditLimit   = toClone.creditLimit;
		this.customer      = toClone.customer;
		this.discountLevel = toClone.discountLevel;
		this.dateCreated   = toClone.dateCreated;
	}
	
	public void setAccountID() {
		String first = customer.getFirst();
		String last  = customer.getLast();
		
		
	}

	public double getBalance() {
		if (balance < 0) return balance = 0.0;
		else return balance;
	}
	
	public double getDiscountLevel() {
		if (discountLevel < 0) return discountLevel = 0.0;
		else return discountLevel;				
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		if (creditLimit * 2 > balance) {
			if (creditLimit < 0) this.creditLimit = balance * 2;
		}
		else this.creditLimit = creditLimit;
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public boolean equals(Account otherAccount) {
		return this.accountID   == otherAccount.accountID        &&
			   this.balance     == otherAccount.balance          &&
			   this.creditLimit == otherAccount.creditLimit      &&
			   this.discountLevel == otherAccount.discountLevel  &&
			   this.dateCreated.equals(otherAccount.dateCreated) &&
			   this.customer.equals(otherAccount.customer);		
	}
	
	
	

	@Override
	public String toString() {
		return "Account: accountID: " + accountID + "Customer: " + customer + ", balance: " + balance + ", creditLimit: " + creditLimit
				+ ", discountLevel: " + discountLevel + ", dateCreated: " + dateCreated;
	}		

} //end of class
