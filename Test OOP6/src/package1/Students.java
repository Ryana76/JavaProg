package package1;

public class Students extends Person{
	int studentsId;

	public Students(String name, String family, int age, int studentsId) {
		super(name, family, age);
		this.studentsId = studentsId;
	}
	
	public void Print() {
		System.out.println("Id student is : "+studentsId);
	}

}
