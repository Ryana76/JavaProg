import java.util.Scanner;

class WhileScanner {
    public static void main(String[] args){
        int sum = 0;

        Scanner numeri = new Scanner(System.in);

        System.out.println("inserisci un numero: ");
        int num = numeri.nextInt();

        while(num > 0){
            sum += num;

            System.out.println("inserisci un numero: ");
            num = numeri.nextInt();
        }
        System.out.println("Sum e: " + sum);
    }
}
