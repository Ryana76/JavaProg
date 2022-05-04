//moltiplicare due numeri in virgola mobile

import java.util.Scanner;

public class Intro_Es3 {
    public static void main(String[] args){
        float risult;

        Scanner numeri = new Scanner(System.in);

        System.out.print("Inserisci un numero virgola mobile : ");
        float num1 = numeri.nextFloat();
        System.out.print("inserisci un altro numero : ");
        float num2 = numeri.nextFloat();

        risult = num1 * num2;
        System.out.println("num1 * num2 = " + risult);

        numeri.close();

    }
}
