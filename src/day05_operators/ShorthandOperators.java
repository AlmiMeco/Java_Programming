package day05_operators;

public class ShorthandOperators {
    public static void main(String[] args) {

        int a = 20;

        System.out.println(a);//-->20

        a = 40;  //using "Assignment" shorthandOperators we can give the variable a new value (x=y)

        System.out.println(a);//-->40

        System.out.println("============================");

        int x = 15;

        System.out.println(x);//--> 15

        x += 10; //(+) adds value (10) to the variable

        System.out.println(x);//-->25

        System.out.println("============================");
         // Subtraction Assignment Operator (x-=y)

        x -= 2;
        System.out.println(x);//--> 25 - 2 = 23

        System.out.println("============================");
        // Multiplication Assignment Operator (x*=y)

        x *=3;
        System.out.println(x);//--> 23 * 3 = 69 (noice)

        System.out.println("============================");
        // Division Assignment Operator (x/=y)

        x /=3;
        System.out.println(x);//--> 69 / 3 = 23

        System.out.println("=============================");
        // Remainder Assignment Operator (x%=y)

        x %=5;
        System.out.println(x);//--> 3
        /*
        --> 23 / 5 = 4.6
        --> 20 / 5 = 4
        --> 3 is left over (remainder)
         */







    }
}
