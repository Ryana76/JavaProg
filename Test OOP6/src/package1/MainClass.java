package package1;

public class MainClass {

	public static void main(String[] args) {
		Students person1 = new Students("Aryana", "Najafi", 24, 12001);
		Students person2 = new Students("Mehran", "Mousavi", 26, 24002);
		Teacher person3 = new Teacher("Mehdi", "Abbasi", 39, 123);
		
		person1.printPersonalInfo();
		person1.Print();
		person2.printPersonalInfo();
		person2.Print();
		person3.printPersonalInfo();
		person3.Print();
	}

}
