public class Product {
	// defined variables
	String name;
	String description;
	String sku;
	double price;
	
	public Product(){}		//no argument constructor
	
	public Product(String name, String description, String sku, double price){
		this.name = name;
		this.description = description;
		this.sku = sku;
		this.price = price;		
	}
	
	//copy constructor
	public Product(Product toClone) {
		this.name        = toClone.name;
		this.description = toClone.description;
		this.sku 		 = toClone.sku;
		this.price 		 = toClone.price;
	}
	
	public Product(String sku){
		this.sku = sku;					
	}
	
	public String getSku() {
		if (sku.length() == 10) {
			if (sku.substring(0, 2).equals("001")) return sku;
			else if (sku.substring(0, 2).equals("002")) return sku;
			else if (sku.substring(0, 2).equals("003")) return sku;
			else if (sku.substring(0, 2).equals("004")) return sku;
			else if (sku.substring(0, 2).equals("110")) return sku;
		} //end of if
		else return "Invalid sku.";
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) System.out.print("Invalid Price.");
		else this.price = price;		
		
		}
	
	public boolean equals(Product otherProduct) {
		return this.name.equals(otherProduct.name)      			&&
			   this.description.equals(otherProduct.description)	&&
			   this.price == otherProduct.price						&&
			   this.sku.equals(otherProduct.sku);				
	}

	@Override
	public String toString() {
		return "Product name: " + name + ", description: " + description + ", sku: " + sku + ", price: " + price;
	}	

} // end of class
