package package1;

public class Student extends Person {
	int studentsId;
	public Student(String name, String family, int age, int studentsId) {
		super(name, family, age);
		this.studentsId = studentsId;
	}
	public void printStudentsId() {
		System.out.println("Students Id is : " + studentsId+"\n");
	}
}
