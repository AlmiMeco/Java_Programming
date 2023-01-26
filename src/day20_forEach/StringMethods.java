package day20_forEach;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        /* .toCharArray() method (no argument needed  ) */

        String str = "Cydeo School";

        char[] ch = str.toCharArray(); // creates an array of string and all its char (elements )

        System.out.println(Arrays.toString(ch));
//      ---> [C, y, d, e, o,  , S, c, h, o, o, l]

        System.out.println("-------------------------------------------------");

        /* .split() method */

        String str2 = "Hello everyone I am studying Java for my future";

        String[] splitString = str2.split(" ");// splits the string based on your parameters :
                                                      //... (" ") split occurs based on spaces

        System.out.println(Arrays.toString(splitString));
//        ---> [Hello, everyone, I, am, studying, Java, for, my, future]

        System.out.println("-------------------------------------------------");

        /* */

    }

}
