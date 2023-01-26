package day37_exceptions;

public class TryCatchBlock {

    public static void main(String[] args) {


        System.out.println("program starts");

        try {


            System.out.println(9 / 0); // code that's creating exception

            //System.out.println("Try Block");

        }catch (ArithmeticException e) { // the exception type goes in ()

            //System.out.println("Catch Block");

            e.printStackTrace();                   // --> prints detailed exception
            System.out.println(e.getMessage());    // --> prints brief description
        }

        System.out.println("program ends");

    }
}
