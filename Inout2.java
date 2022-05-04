//Inserisci float: 2.343
//Float inserito = 2.343
//Inserisci doppio: -23.4
//Doppio inserito = -23.4
//Inserisci il testo: Ehi!
//Testo inserito = Ehi!

import java.util.Scanner;

public class Inout2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un float: ");
        float myFloat = input.nextFloat();
        System.out.print("hai inserito: " + myFloat);

        System.out.print("Inserisci un double; ");
        double myDouble = input.nextDouble();
        System.out.print("hai inserito: " + myDouble);

        System.out.print("inserisci un  testo: ");
        String myString = input.next();
        System.out.print("Hai iserito: " + myString);

        input.close();
    }
}
