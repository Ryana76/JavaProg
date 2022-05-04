package package1;

public class Person {
	public String name;
	public String family;
	public int age;
	public Person(String name, String family, int age) {
		this.name = name;
		this.family = family;
		this.age = age;
	}
	public void printPersonInfo() {
		System.out.println("Name : " + name + "\tFamily : " +family + "\tAge : " + age);
	}
	
}
