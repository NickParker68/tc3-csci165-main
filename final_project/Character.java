public abstract class Character {
	
	private int health;
	//private Color color; not sure if this is a separate class or linked with health.
	private MyPoint point;
	private int time;
	
	Character(){ } //no argument constructor
	
	public void move(MyPoint point){	
		System.out.println("move was called");
		
	}
	
	public void attack(Character c) {
		System.out.println("attack was called");
	}
	
	public void stay() {
		System.out.println("stay was called");
		
	}	

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	
	

}
