// var usando = : 4
// var usando += : 8
// var usando *= : 32


public class Op_Assegniazione {
    public static void main(String[] args){

        int num = 4;
        int var;

        var = num;      //var = 4
        System.out.println("var usando = : " + var);

        var += num;     //var = 8
        System.out.println("var usando += : " + var);

        var *= num;     //var = 32
        System.out.println("var usando *= : " + var);


    }
}
