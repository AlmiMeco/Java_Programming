package day05_operators;

public class UnaryOperators {
    public static void main(String[] args) {
        // pre increment/decrement
        int x = 10;

        System.out.println(++x); //pre-increment (the unaryOperator comes BEFORE the value) [increases by 1 = 11]
        System.out.println(x); //once the pre-increment is assigned it will always output the same (x=11)

        System.out.println("------------------------------");
        int y = 100;
        System.out.println(y);
        System.out.println(--y); //decreases the value by "1"
        System.out.println(y); //y is always = to (100-1) after the decrement

        System.out.println("==============================");
        // post increment/decrement
        int a = 50;

        System.out.println(a++); //50 bc the operator is POSTponed
        System.out.println(a); //51

        int b = 25;

        System.out.println(b--); //25
        System.out.println(b); //24 *the ONLY difference b/w pre and post, is WHEN the operator is applied

        System.out.println("==============================");

        int n = 30;
        int m = n++; // m=30 n=31

        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }
}
