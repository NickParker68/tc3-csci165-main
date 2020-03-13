import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Address{

	private String 	street;
	private String 	city;
	private String 	state;
	private int 	zip;
	
	//create file instance
	File file = new File("zip_code_database.csv");
	
	public Address(){}

	public Address(String s, String c, String state, int z){
		this.street = s;
		this.city 	= c;
		this.state 	= state;
		this.zip 	= z;
	}
	
	//copy constructor
	public Address(Address toClone) {
		this.street = toClone.street;
		this.city   = toClone.city;
		this.state  = toClone.state;
		this.zip    = toClone.zip;		
	}

	public String getStreet(){
		return street;
	}

	public String getCity(){
		return city;
	}

	public String getState(){
		return state;
	}

	public int getZip(){
		return zip;
	}

	public boolean equals(Address a){
		return 	this.street.equals(a.street) 	&&
				this.city.equals(a.city) 		&&
				this.state.equals(a.state) 		&&
				this.zip == a.zip;

	}
	public String toString(){
		return street + ", " + city + ", " + state + ", " + zip;
	}
}
