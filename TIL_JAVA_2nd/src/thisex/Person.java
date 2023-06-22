package thisex;

public class Person {
	String name;
	int age;
	
	Person( ) {
		this("name x", 1);
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf( ) {
		return this;
	}
}
