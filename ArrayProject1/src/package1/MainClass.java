package package1;

import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Random random= new Random();
		Scanner reader = new Scanner(System.in);
		
		int[] myArray = new int[10];
		
		myArray[0] = 350;
		myArray[1] = 9;
		myArray[2] = random.nextInt(200);
		myArray[9] = 101;
		myArray[7] = reader.nextInt();
		
		
		for(int index = 0; index < 10; index++) {
			if(myArray[index] == 0) {
				System.out.println("item["+index+"]: ...This item is 0...");

			}
			else {
				System.out.println("item["+index+"]:\t"+myArray[index]);
			}
		

		
//		for(int index = 0; index < 10; index++) {
//			if(myArray[index] == 0) continue;
//			else {
//				System.out.println("item["+index+"]:\t"+myArray[index]);
//			}
		}
		
		
		
//		for(int index = 0; index < 10; index++) {
//			System.out.println("item["+index+"]:\t"+myArray[index]);
//		}
//		
		
//		System.out.println(myArray[0]);
//		System.out.println(myArray[1]);
//		System.out.println(myArray[2]);
//		System.out.println(myArray[9]);
//		System.out.println(myArray[7]);
	}

}
