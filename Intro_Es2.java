//Program to Add Two Integers

import java.util.Scanner;

public class Intro_Es2 {
    public static void main(String[] args){

        int risulta;

        Scanner numeri = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int num1 = numeri.nextInt();
        System.out.print("Inserisci un altro numero: ");
        int num2 = numeri.nextInt();

        risulta = num1 + num2;
        System.out.print("num1 + num2 = " + risulta);

        numeri.close();
    }
}
