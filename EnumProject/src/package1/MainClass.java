package package1;

enum Color{
	RED,GREEN,BLUE,YELLOW
}

public class MainClass {

	public static void main(String[] args) {
		
//		System.out.println(Color.values());
		
		Color color1 = Color.RED;
		Color color2 = Color.GREEN;
		Color color3 = Color.BLUE;
		Color color4 = Color.YELLOW;
		
		for (Color colors : Color.values()) {
			System.out.print(colors+" ");
		}
		System.out.println();
		
		System.out.print("["+color1+", ");
		System.out.print(color2+", ");
		System.out.print(color3+", ");
		System.out.print(color4+"]");
	}

}
