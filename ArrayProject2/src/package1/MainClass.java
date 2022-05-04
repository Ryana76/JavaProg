package package1;

import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		
		int[] intArray= new int[5];
		char[] charArray= {'A', 'B', 'C', 'A', 'B'};
		String[] stringArray= {"Aryana", "Mehran", "Arya", "Mehdi", "Hichkas"};
		double[] doubleArray= new double[5];
		for(int index = 0; index < intArray.length; index++) {
			intArray[index] = random.nextInt(40);
			doubleArray[index] = random.nextDouble();
		}
		
		
		System.out.print("{");
		for (int index = 0; index < intArray.length; index++) {
			System.out.print(intArray[index]+", ");
		}
		System.out.println("...End}");
		
		
		
		System.out.print("{");
		for (int index = 0; index < charArray.length; index++) {
			System.out.print(charArray[index]+", ");
		}
		System.out.println("...End}");
		
		
		
		System.out.print("{");
		for (int index = 0; index < stringArray.length; index++) {
			System.out.print(stringArray[index]+", ");		
			}
		System.out.println("...End}");
		
		

		System.out.print("{");
		for (int index = 0; index < doubleArray.length; index++) {
			System.out.print(doubleArray[index]+", ");
			}
		System.out.println("...End}");
		
	
//		Random random = new Random();
//		
//		int[] myArray = new int[5];
//		
//		for(int index = 0; index < myArray.length; index++) {
//			myArray[index] = random.nextInt(40);
//		}
//		
//		System.out.print("{");
//
//		for (int item : myArray) {
//			System.out.print(item+", ");
//		}
//		System.out.print("...End}");
//		
		
//		for (int index = 0; index < myArray.length; index++) {
//			System.out.println("item["+index+"]:\t"+myArray[index]);
//		}
	}

}
