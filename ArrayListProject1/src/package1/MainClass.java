package package1;

import java.util.ArrayList;
//import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
//		List<String> myList = new ArrayList<String>();
		ArrayList<String> myList = new ArrayList<String>();
		
		myList.add("Aryana0");
		myList.add("Aryana1");
		myList.add("Aryana2");
		myList.add("Aryana3");
		
		myList.set(3, "Ex");
		
		myList.remove(1);
		
		for (int index = 0; index < myList.size(); index++) {
			System.out.print(myList.get(index)+" ,");
		}
		System.out.print("...End!!!");
				
//		for (String item : myList) {
//			System.out.print(item+", ");
//		}
//		System.out.print("...End!!!");

	}

}
