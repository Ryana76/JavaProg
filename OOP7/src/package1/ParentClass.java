package package1;

public class ParentClass {
	int number1;
	int number2;
	String color = "Red";
	
	public ParentClass(int number1, int number2) {
		this.number1=number1;
		this.number2=number2;
	}
	
	public void Print() {
		System.out.println("number 1 is: "+number1+"\tnumber 2 is: "+number2);
	}
	
	int sum(int number1, int number2) {
		return number1+number2;
	}	
}
