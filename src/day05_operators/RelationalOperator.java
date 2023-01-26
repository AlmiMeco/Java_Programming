package day05_operators;

public class RelationalOperator {
    public static void main(String[] args) {

        // Greater than (>) Relational Operator
        int a = 1000;
        int b = 200;

        System.out.println(a > b);// True
        System.out.println(b > a);// False

        System.out.println("----------------------");
        // Greater than / equal to (>=)
        int c = 1000;

        System.out.println(a >= c);// True
        System.out.println(c >= b);// True

        System.out.println("-----------------------");
        // Less than (<) ; Less than / equal to (<=)
        /*
        The same as greater than (or equal to) just with less than (or equal)
        still two outcomes = TRUE / FALSE
         */

        // Equal to (==)
        int d = 200;
        System.out.println(d == b); //True
        System.out.println(a == d); //False (a is greater than d)
        System.out.println("Hello" == "Goodbye"); // False
        // you can use Relational Operators for ... variables, integers, and Strings of text

        System.out.println("------------------------");
        // Not equal to (!=)

        System.out.println(d != c); // True (200 does not equal 1000)
        System.out.println(d != b);// False (d,b = 200)
        System.out.println("Hello" != "Goodbye");// true
        // same goes for (not equal to)


    }
}
