package package1;

public class MainCalss {

	public static void main(String[] args) {
		
		ParentClass person1 = new ParentClass(10, 20);
		person1.Print();
		
		
		ChildClass person2 = new ChildClass(50, 100, "Mahdi");
		person2.Print();
		
		
	}

}
