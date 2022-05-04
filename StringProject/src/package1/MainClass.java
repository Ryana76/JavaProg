package package1;

public class MainClass {

	public static void main(String[] args) {
		
		String string3 = "My Name Is Aryana...!";
		String string4 = "Aryana...!";
		String string5 = "";
		String string6 = "Test";
		String string7 = "     My Name Is Aryana...!      ";
		String[] stringArray = {"Mehran","Aryana","Aryan","Mehrana"};

		
		System.out.println(string3.length());
		System.out.println(string3.substring(3, 7));
		System.out.println(string3.substring(11));
		if (string3.equals(string4))
			System.out.println("True");
		else
			System.out.println("False");
		System.out.println(string3.equals("My Name Is Aryana...!"));
		System.out.println(string3.equals(string4));
		System.out.println(string3.isEmpty());
		System.out.println(string5.isEmpty());
		System.out.println(string4.concat(string6));
		System.out.println(string3.replace("Aryana", "******"));
		System.out.println(string3.replace("a", "*").replace("A", "*"));
		for (String world : string3.split(" "))
			System.out.println(world);
		System.out.println(string4.indexOf('a'));
		System.out.println(string3.indexOf('A'));
		System.out.println(string3.indexOf("Aryana"));
		System.out.println(string3.indexOf("Mehran"));
		System.out.println(string4.toUpperCase());
		System.out.println(string4.toLowerCase());
		System.out.println(string7);
		System.out.println(string7.trim());
		System.out.println(String.join("//", string3,string4,string5,string6,string7));
		System.out.println(String.join(", ", stringArray));
		
		
		
		
		char[] charArray = {'A','r','y','a','n','a'};
		String string1 = "Aryana";
		
		String string2 = new String(charArray);
		
		System.out.println("Index 2 in charArray is: "+charArray[2]);
		System.out.println("Index 2 in string1 is: "+string1.charAt(2));
		
		System.out.print("My charArray is: ");
		System.out.println(charArray);
		System.out.println("My string1 is: "+string1);
		
		
		
	}

}
