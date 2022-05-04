//come stampare un numero intero inserito da un utente

import java.util.Scanner;

public class Intro_Es1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un numro integer: ");
        int num = input.nextInt();
        System.out.print("Hai inserito: "+ num);

        input.close();

    }
}
