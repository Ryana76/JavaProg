package package1;

public abstract class Person {
	
	String name;
	String family;
	int age;
	
	public Person(String name, String family, int age) {
		this.name = name;
		this.family = family;
		this.age = age;
	}

	public void PrintPersonalInfo() {
		System.out.println("Name: "+name+"\tFamily: "+family+"Age: "+age);
	}
	
	abstract void Print();
}
