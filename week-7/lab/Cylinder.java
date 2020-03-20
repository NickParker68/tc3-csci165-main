
public class Cylinder extends MyCircle {
	
	private double height;
	
	// constructor with default radius and height
	public Cylinder() {
		super(); // call superclass no arg constructor
		height = 1.0;
	}
	
	public Cylinder(MyPoint center, int radius, double height) {
		super(center, radius);
		this.height = height;		
	}
	
	public Cylinder(double height) {
		super();
		this.height = height;
	}
	
	public Cylinder(int radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return getArea() * height;
	}

	@Override
	public String toString() {
		return "Cylinder height: " + height;
	}
	
	

}
