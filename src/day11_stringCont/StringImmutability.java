package day11_stringCont;

public class StringImmutability {

    public static void main(String[] args) {

        String str = "Java";


        System.out.println(str.toLowerCase());
               //str.toLowerCase();     ----> outputs new string in all lowercase         ---> "java"

        System.out.println(str.toUpperCase());
               // str.toUpperCase();    ----> outputs new string in all CAPS              ---> "JAVA"

        System.out.println(str);
               // the value of str is still = "Java"

        /* String is IMMUTABLE, meaning in cannot be altered; line 13 & 16 ---> create a new string
        ... the original is still stored in the heap */





    }

}
