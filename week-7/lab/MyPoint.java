

public class MyPoint {
	
	int x = 0;
	int y = 0; 
	int[] XY = new int[2];
	
	MyPoint() {} //no argument constructor
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	
	}
	
	public int[] getXY() {
		int[] XY = {x, y};
		return XY;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public double distance(int x2, int y2) {
		int x1 = x;
		int y1 = y;
		return Math.sqrt(((y2 - y1) * (y2 - y1)) + ((x2 - x1) * (x2 - x1)));
		
	}
	
	public double distance(MyPoint another) {
		int x1 = x;
		int y1 = y;
		int x2 = another.getX();
		int y2 = another.getY();
		return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 -x1) * (x2 - x1));
		
	}
	
	public double distance() {
		int x1 = x;
		int y1 = y;
		int x2 = 0;
		int y2 = 0;
		return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 -x1) * (x2 - x1));
	}
	
	
	
	
}
