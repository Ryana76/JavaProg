package package1;

public class MainClass {

	public static void main(String[] args) {
		Student student1 = new Student("Ali", "Rezai", 30, 1); 
		Student student2 = new Student("Reza", "Javadi", 29, 2);
		Teacher teacher1 = new Teacher("Mehdi", "Abbasi", 39, 10); 
		student1.printPersonInfo();
		student1.printStudentsId();
		student2.printPersonInfo();
		student2.printStudentsId();
		teacher1.printPersonInfo();
		teacher1.printTeacherCode();

	}

}
