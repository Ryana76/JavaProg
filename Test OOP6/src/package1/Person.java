package package1;

public class Person {
	public String name;
	public String family;
	public int age;
	
	
	public Person(String name, String family, int age) {
		super();
		this.name = name;
		this.family = family;
		this.age = age;
	}
	
	public void printPersonalInfo() {
		System.out.println("Name: "+name+"\tFamily: "+family+"\tage: "+age);
	}
	
	
}

