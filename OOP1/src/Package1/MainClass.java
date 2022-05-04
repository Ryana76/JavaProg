package Package1;

public class MainClass {

	public static void main(String[] args) {
		
		int result = sum(2,10,8);
		System.out.println(result);
		System.out.println(sum(200,400,600));
		
		multiple(5, 60);
		multiple(100, 5);		
	}
	
	public static int sum(int number1, int number2, int number3) {
		int temp = number1+number2+number3;
		return temp;
	}
	public static void multiple(int number1, int number2) {
		int temp = number1*number2;
		System.out.println(temp);
	}
	

}
