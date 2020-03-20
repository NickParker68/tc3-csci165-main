public class MyCircle {
	
	private MyPoint center = new MyPoint();
	private int radius = 1;
	private int x = center.getX();
	private int y = center.getY();
	private int[] XY = new int[2];
	
	MyCircle(){} //no argument constructor
	
	MyCircle(MyPoint center){
		this.center = center;
	}
	
	MyCircle(int radius){
		this.radius = radius;
	}
	
	
	MyCircle(int x, int y, int radius){		
		this.x = x;
		this.y = y;
		this.radius = radius;				
	} 
	
	MyCircle(MyPoint center, int radius){
		this.center = center;
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getCenterX() {
		return center.getX();
	}

	public void setCenterX(int x) {
		this.x = x;
	}

	public int getCenterY() {
		return center.getY();
	}

	public void setCenterY(int y) {
		this.y = y;
	}
	
	public int[] getCenterXY() {
		int[] XY = {x, y};
		return XY;
	}
	
	public void setCenterXY(int x, int y) {
		this.x = x;
		this.y = y;		
	}

	@Override
	public String toString() {
		return "center: " + center + ", radius: " + radius;
	}
	
	public double getArea() {
		return Math.PI * (radius * radius);
	}
	
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	public double distance(MyCircle another) {
		MyPoint center1 = center;
		MyPoint center2 = another.center;
		
		return center1.distance(center2);		
	}				
	
} //end of class
