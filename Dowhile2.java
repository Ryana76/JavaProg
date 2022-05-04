import java.util.Scanner;

class Dowhile2 {
    public static void main(String[] args){
        int num = 0;
        int sum = 0;

        Scanner numeri = new Scanner(System.in);

        do {
            System.out.println("enter a number: ");
            num = numeri.nextInt();
            sum+=num;
        }while (num > 0);

        System.out.println("Sum is : "+sum);
    }
}
