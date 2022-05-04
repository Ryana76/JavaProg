import java.util.Scanner;

public class Intro_Es8 {


    public static void main(String[] args){

        Scanner caratteri = new Scanner(System.in);

        System.out.print("inserisci un carattere : ");
        char cara = caratteri.next().charAt(0);
//
//        if (cara == 'a' || cara == 'e' || cara == 'o' || cara == 'i' || cara == 'u'){
//            System.out.println("caratter e vocale!");
//        }else{
//            System.out.println("caratter e costante");
//        }

        switch (cara){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("caratter e vocale");
                break;
            default:
                System.out.println("caratter e costante");

        }

    }


}
