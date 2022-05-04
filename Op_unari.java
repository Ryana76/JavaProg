//Valore di num1: 12
//Dopo l'incremento: 13
//Valore di num2: 12
//Dopo il decremento: 11

public class Op_unari {
    public static void main(String[] args){
        int num1, num2;
        int risult1, risult2;

        num1 = 12;
        System.out.println("Valore di a: " + num1);

        risult1 = ++num1;
        System.out.println("Dopo l'incremento: " + risult1);

        num2 = 12;
        System.out.println("Valore di b: " + num2);

        risult2 = --num2;
        System.out.println("Dopo il decremento: " + risult2);
    }
}
