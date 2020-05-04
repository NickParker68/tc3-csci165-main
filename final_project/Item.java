public abstract class Item {
	
	Item(){ } //no argument
	
	private MyPoint location;

	public MyPoint getLocation() {
		return location;
	}

	public void setLocation(MyPoint location) {
		this.location = location;
	}

}
