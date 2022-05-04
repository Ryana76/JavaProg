package package1;

public class MainClass {

	public static void main(String[] args) {
		
		MyClass object1 = new MyClass();
		object1 .number1 = 100;
		MyClass object2  = new MyClass();
		object2.number1 = 300;
		System.out.println(object1 .number1);
		System.out.println(object2.number1);
		
		object1 .number2 = 200;
		object2.number2 = 400;
		System.out.println(object1 .number2);
		System.out.println(object2.number2);

		MyClass.number2 = 250;
		System.out.println(MyClass.number2);

	}

}
