package day10_string;

import java.lang.String; //implicitly applied (import statement not needed) (.lang pg20)

public class StringIntro {
    public static void main(String[] args) {

        String r1 = "Java"; //string created using "String Literal (classic way)"
        String r2 = "Java";

        String r3 = new String("Java"); //String created using "new keyword"

        System.out.println(r1 == r2); // true  : only one "Java" is stored in the String Pool
        System.out.println(r1 == r3); // false : even tho they are the same word r1 is stored in the pool,
        // but r3 is stored as a seperate object in the Java Heap







    }

}
