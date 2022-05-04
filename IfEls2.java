//Il numero è positivo.
//Dichiarazione al di fuori di if...else block


public class IfEls2 {
    public static void main(String[] args){
        int numero = -5;

        if (numero < 0){
            System.out.println("il numero e negativo!");
        }
        else {
            System.out.println("il numero e positivo!");
        }

        System.out.println("fuori dal blocco if...else!");
    }
}
