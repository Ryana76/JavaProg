public class Op_logici {
    public static void main(String[] args){

        //OP &&
        System.out.println((5>3) && (8>5));     //true
        System.out.println((5>3) && (8<5));     //false

        //OP ||
        System.out.println((5<3) || (8>5));     //true
        System.out.println((5>3) || (8<5));     //true
        System.out.println((5<3) || (8<5));     //false

        //OP !
        System.out.println(!(5==3));            //true
        System.out.println(!(5>3));             //false

    }
}
