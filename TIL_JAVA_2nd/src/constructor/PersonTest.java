package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personKim = new Person();
		personKim.name = "kimyoo";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		
		Person personLee = new Person("Leesoon", 175, 75);
		
	}
	
}
