import java.util.Scanner;

public class Input {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un numero :");
        int num = input.nextInt();

        System.out.println("Hai inserito : " + num);

        input.close();
    }

}
