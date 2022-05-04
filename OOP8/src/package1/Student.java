package package1;

public class Student extends Person {

	
	int studentId;
	
	public Student(String name, String family, int age, int studentId) {
		super(name, family, age);
		this.studentId = studentId;
	}

	@Override
	void Print() {
		System.out.println("Student Id: "+studentId);
	}
	

}
