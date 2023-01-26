package day16_nestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = false;
        boolean condition2 = true;

        do {
            System.out.println("Hello Cydeo");
        }while (condition);  // one print of "Hello Cydeo"

        do {
            System.out.println("Hello Cydeo");
        }while (condition2); // infinite prints of "Hello Cydeo"

    }

}
