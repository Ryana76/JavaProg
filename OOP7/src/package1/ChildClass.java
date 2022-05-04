package package1;

public class ChildClass extends ParentClass{
	final String name;
	
	public ChildClass(int number1, int number2, String name) {
		super(number1, number2);
		this.name=name;
	}
	
	public void Print() {
		System.out.println("Name is: "+name);
		super.Print();
		System.out.println(super.color);
	}
	int sum(int number1, int number2) {
		int result = number1 + number2;
		return result;
	}
}
