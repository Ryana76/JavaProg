package package1;

public class MainClass {

	public static void main(String[] args) {
		IA object1 = new ChildClass1();
		IA object2 = new ChildClass2();
		
		object1.Print();
		object2.Print();
		
		object1.testPrint();
		object2.testPrint();
			
		System.out.println(IA.PI);
		System.out.println(IA.sum(23, 45));
		
		IB object3 = new ChildClass3();
		IC object4 = new ChildClass4();
		
		object3.Show();
		object4.Show();
		object4.Message();
		
	}
}
