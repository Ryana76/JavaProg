import java.util.Scanner;

class Break2 {
    public static void main(String[] args){
        double num, sum = 0;

        Scanner numeri = new Scanner(System.in);

        while(true){
            System.out.println("enter number: ");
            num = numeri.nextDouble();
            if (num==0.0){
                break;
            }
            sum+=num;
        }
        System.out.println("Sum is : " + sum);
    }
}
