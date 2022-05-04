import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hashList = new HashMap<String, Integer>();
		
		hashList.put("Red", 23);
		hashList.put("Green", 82);
		hashList.put("Blue", 67);
		
		System.out.println("befor Remove key...");
		System.out.println(hashList.keySet());
//		for(String color : hashList.keySet()) {
//			System.out.println(color+" is: "+hashList.get(color));
//		}
		System.out.println();
		
		hashList.remove("Blue");
		
		System.out.println("After Remove \"Blue\" key...");
		System.out.println(hashList.keySet());
//		for (String color: hashList.keySet()) {
//			System.out.println(color+" is: "+hashList.get(color));
//		}
		System.out.println();

		
		System.out.println("After usare clear key...");
		hashList.clear();
		if(hashList.size()==0) {
			System.out.println("Hash List is Empty....!");
		}
		System.out.println(hashList.keySet());

		
		
		
		
		
		
		
//		HashMap<Integer, String> hashList = new HashMap<Integer, String>();
//		hashList.put(100, "Mehdi");
//		hashList.put(124, "Reza");
//		hashList.put(12, "Ali");
//		for (String item : hashList.values()) {
//			System.out.print(item+", ");
//		}
//		for (int item : hashList.keySet()) {
//			System.out.print(item+", ");
//		}
//		for (int item : hashList.keySet()) {
//			System.out.println(item+" is: "+hashList.get(item));
//		}
//		System.out.println(hashList.get(100));
//		System.out.println(hashList.values());
//		System.out.println(hashList.keySet());
	}

}
