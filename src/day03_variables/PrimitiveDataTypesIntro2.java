package day03_variables;

public class PrimitiveDataTypesIntro2 {
    public static void main(String[] args) {
        // "char" is a data type used to express a SINGLE charachter (?,!,@,*,1,+...)
        char a = '?';
        char b = '@';
        System.out.println(a);
        System.out.println(b);
        // a single quote is used for char (')

        char ch1 = 0313;
        System.out.println(ch1);
        // you can also aisgn "char" variables using the ASCII Table (0 ~ 65,535)
        System.out.println("====================================");


        boolean r1 = true;
        // "boolean" is only used for True/False
        System.out.println(r1);
        boolean r2 = 100 < 1;
        System.out.println(r2);
        // 100 is NOT less than (<) 1 so the outcome is false


    }
}
