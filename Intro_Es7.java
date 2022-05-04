import java.util.Scanner;

class Intro_Es7 {
    public static void main(String[] args){
        Scanner numeri = new Scanner(System.in);

        System.out.println("scrivi un numero :");
        Double num = numeri.nextDouble();

        if (num % 2 == 0){
            System.out.println("numero e pari!");
        }else {
            System.out.println("numero e dispari!");
        }
    }
}
