package package1;

public interface IA {
	float PI = 3.14f;
	
	void Print();

	default void testPrint() {
		System.out.println("Hello");
	}
	
	
	static int sum(int number1, int number2) {
		return number1+number2;
	}
	
}
