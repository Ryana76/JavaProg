public class IfEls4 {
    public static void main(String[] args){
        Double num1 = -1.5, num2 =4.5, num3 = -5.3, numBig;

        if (num1 >= num2){

            if (num1 >= num3){
                numBig = num1;
            }
            else{
                numBig = num3;
            }
        }
        else{
            if (num2 >= num3){
                numBig = num2;
            }
            else{
                numBig = num3;
            }
        }

        System.out.println("numero grande e : " + numBig);
    }
}
