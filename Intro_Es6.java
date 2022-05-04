//scambia due numeri usando la variabile temporanea
//        --Prima di scambiare--
//        Primo numero = 1.2
//        Secondo numero = 2.45
//        --Dopo lo scambio--
//        Primo numero = 2.45
//        Secondo numero = 1.2


public class Intro_Es6 {
    public static void main(String[] args){

        float num1 = 1.2f, num2 = 2.45f;
        float temp;

        System.out.println("--Prima di scambiare--" + "\n"
                + "num1 : " + num1 + "\n"
                + "num2 : " + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("--Dopo lo scambio--" + "\n"
                + "num1 : " + num1 + "\n"
                + "num2 : " + num2);
    }
}
