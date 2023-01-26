package day11_stringCont;

public class StringMethods2 {

    public static void main(String[] args) {

//          .trim() ---> removes 'white spaces' (empty spaces in String)

        String r = "       Java";

        System.out.println(r.trim());// ---> "Java"

        //-------------------------------------------------------------------------------------

//          .indexOf() ---> outputs the index number of the String / Character (the first instance from left --> right)

        String a = "Zebra in the Safari"; // index = 18
//                               ^

        System.out.println(a.indexOf('S')); // ---> 13

        System.out.println(a.indexOf("ri")); // ---> 17 (outputs the index of the first number 'r=17')


//       .lastIndexOf() ---> outputs the LAST characters index number (IndexOf() but in reverse)

        System.out.println(a.lastIndexOf('i')); // ---> 18 (the index of the last 'i' from left ---> right)

        System.out.println("-------------------------------------------------------------------");

        //-------------------------------------------------------------------------------------

        String sentence = "I love Java, I can't wait to get a job";

//        .replace( oldValue, newValue ) ---> returns new String with values (words) replaced

        System.out.println(sentence.replace("Java", "Python"));// replaces Java -w/--> Python
//       ---> I love Python, I can't wait to get a job

        System.out.println("-------------------------------------------------------------------");

        //-------------------------------------------------------------------------------------

//        .substring( beginningIndex, endingIndex ) ---> creates substring from the og String

        String subString = "I Love Cydeo School"; // Cydeo ---> beginningIndex= 7 endingIndex= 12

        System.out.println(subString.substring(7, 12)); // prints out ---> "Cydeo"

        System.out.println("-------------------------------------------------------------------");

        //-------------------------------------------------------------------------------------

//        .repeat( count ) ---> repeats string for z given number (count) of times

        String z = "Python";

        System.out.println(z.repeat(10)); // python repeated 10 times
//        ---> PythonPythonPythonPythonPythonPythonPythonPythonPythonPython

        String z2 = (z + "\n").repeat(5); // python repeated 5 times but in z new "\n" print each time
        System.out.println(z2);
//        ---> Python
//             Python
//             Python
//             Python
//             Python

        //-------------------------------------------------------------------------------------







    }

}
