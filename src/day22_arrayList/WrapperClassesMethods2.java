package day22_arrayList;

public class WrapperClassesMethods2 {
    public static void main(String[] args) {


        char ch = 'A';
        char ch2 = '1';


//        |isDigit Method|
//        --- checks if char is b/w 0-9 on ASCII table ---> returns true if true
        System.out.println(Character.isDigit(ch2)); // ---> true
        System.out.println(Character.isDigit(ch)); //  ---> false

        System.out.println("--------------------------------------------");

//        |isLetter Method|
//        --- checks if char is an uppercase / lowercase letter ---> returns true if true
        System.out.println(Character.isLetter(ch));  // ---> true
        System.out.println(Character.isLetter(ch2)); // ---> false

        System.out.println("--------------------------------------------");

//        |isLetterOrDigit|
//        --- check if char is letter / digit ---> returns true if true
        System.out.println(Character.isLetterOrDigit(ch));  // ---> true
        System.out.println(Character.isLetterOrDigit(ch2)); // ---> true

        /* Using isLetterOrDigit we can also find special char (! @ # $ % &....) using {!} operator */

        char ch3 = '@';

        System.out.println(!Character.isLetterOrDigit(ch3)); // ---> true


    }

}
