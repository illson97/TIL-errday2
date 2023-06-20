package thisex;

public class CallAnotherConst {
	public static void main(String[ ] args) {
		Person noName = new Person( );
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf( );
		System.out.println(p);
		System.out.println(noName);
	}
}
