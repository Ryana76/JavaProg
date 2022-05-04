package package1;

public class MainClass {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.setName("Mahdi");
		person1.setFamily("Abbasi");
		person1.setAge(29);
		person1.setAvg(15.67f);

		Person person2 = new Person();
		person2.setName("Ali");
		person2.setFamily("Rezai");
		person2.setAge(20);
		person2.setAvg(19.75f);

		System.out.println(person1.getName());
		System.out.println(person1.getFamily());
		System.out.println(person1.getAge());
		System.out.println(person1.getAvg());

		System.out.println(person2.getName());
		System.out.println(person2.getFamily());
		System.out.println(person2.getAge());
		System.out.println(person2.getAvg());

	}
}
