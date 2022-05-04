package package1;

public class Teacher extends Person{
	
	int teachersCode;

	public Teacher(String name, String family, int age, int teachersCode) {
		super(name, family, age);
		this.teachersCode = teachersCode;
	}
	
	public void Print() {
		System.out.println("Teacher's Code is : " + teachersCode);
	}
	
	

}
