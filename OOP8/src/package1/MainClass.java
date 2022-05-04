package package1;

public class MainClass {

	public static void main(String[] args) {
		Person person1 = new Student("Aryana", "Najafi", 24, 1201);
		Person person2 = new Teacher("Mehran", "Mousavi", 26, 2402);
		
		person1.PrintPersonalInfo();
		person1.Print();

		person2.PrintPersonalInfo();
		person2.Print();
	}

}
