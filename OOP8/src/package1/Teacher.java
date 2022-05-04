package package1;

public class Teacher extends Person{
	
		int teacherCode;
		
		
	public Teacher(String name, String family, int age, int teacherCode) {
		super(name, family, age);
		this.teacherCode = teacherCode;
	}

	@Override
	void Print() {
		System.out.println("Teacher code: "+teacherCode);
		
	}
	
	
	
	
}
