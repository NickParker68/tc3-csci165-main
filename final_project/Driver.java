public class Driver {
	
	static Hobbit hobbit = new Hobbit();
	static Nazgul nazgul = new Nazgul();
	
	static Sword sword   = new Sword();
	static Shield shield = new Shield();
	
	
	static Character[] characterArray = new Character[2];
	
	

	public static void main(String[] args) {
		characterArray[0] = hobbit;
		characterArray[1] = nazgul;
		
		hobbit.setHealth(10);
		hobbit.setTime(4);
		nazgul.setHealth(11);
		nazgul.setTime(5);
		
		sword.setStrength(13);
		shield.setDeflect(12);
		
		for(Character character: characterArray) {
			System.out.println(character.getHealth());
			System.out.println(character.getTime());
			
		}	
		
		System.out.println(sword.getStrength());
		System.out.println(shield.getDeflect());

	}

}
