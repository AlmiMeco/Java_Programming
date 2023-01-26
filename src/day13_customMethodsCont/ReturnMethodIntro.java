package day13_customMethodsCont;

public class ReturnMethodIntro {
    public static void main(String[] args) {

int total = addition(10,3);// using the 'int' data type you can return the result (n1 + n2) to a variable
        System.out.println(total);

        System.out.println("------------------------------------------------------------");

        System.out.println(square(10)); // 10 squared = 100
        System.out.println(cube(10));   // 10 cubed   = 1000

    }

// using a data type (int), you can make the result reusable (variable)
    public static int addition (int n1, int n2){

        return n1 + n2;
    }

    public static int square (int num){
        int square = num * num;
        return square;
    }

//    Using the "RETURNED" value of 'square'... we are able to generate new value ---> 'cube'
    public static int cube (int num){
        int cube = square(num) * num;
        return cube;
    }

}
