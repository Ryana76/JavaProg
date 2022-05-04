package package1;

import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		

		printArray(readArray(10));
		printArray(new int[] {5,4,9,77,2});
		printArray(readArray(2));

	}
	
	static int[] readArray(int number) {
		Random random = new Random();
		int[] myArray = new int[number];
		for (int index = 0; index < myArray.length; index++) {
			myArray[index] = random.nextInt(50);
		}
		return myArray;
	}
	
	static void printArray(int[] Array) {
		System.out.print("{");
		for (int item : Array) {
			System.out.print(item+", ");
		}
		System.out.println("...End}");
	}

}
