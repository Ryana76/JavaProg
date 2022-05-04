package package1;

import java.util.Random;
//import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		
		int[][] myArray = new int[3][];
		myArray[0] = new int[5];
		myArray[1] = new int[3];
		myArray[2] = new int[10];
		
		raedArray(myArray);
		printArray(myArray);
		
//		
//		for (int index1 = 0; index1 < myArray.length; index1++) {
//			for (int index2 = 0; index2 < myArray.length; index2++) {
//				myArray[index1][index2] = random.nextInt(30);
//			}
//		}

		
//		printArray(readArray(2, 3));

	}
	
	static int[][] raedArray(int[][] myArray) {
		

		Random random = new Random();

		for (int index1 = 0; index1 < myArray.length; index1++) {
			for (int index2 = 0; index2 < myArray[index1].length; index2++) {
				myArray[index1][index2] = random.nextInt(30);
				
			}
		}
		return myArray;
	}
	
	
//	
//	static int[][] readArray(int number1, int number2){
//		Scanner reader = new Scanner(System.in);
//		int[][] array = new int[number1][number2];
//		
//		
//		for (int index1 = 0; index1 < array.length; index1++) {
//			for (int index2 = 0; index2 < array[index1].length; index2++) {
//				System.out.print("item["+index1+"]["+index2+"]:\t");
//				array[index1][index2]= reader.nextInt();
//			}
//		}
//		
//		
//		return array;
//	}
	
	static void printArray(int[][] array) {
		System.out.println();
		for (int index1 = 0; index1 < array.length; index1++) {
			for (int index2 = 0; index2 < array[index1].length; index2++) {
				System.out.print(array[index1][index2]+"\t");
			}
			System.out.println();
		}
	}
}

