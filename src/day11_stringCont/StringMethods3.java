package day11_stringCont;

public class StringMethods3 {
    public static void main(String[] args) {

      /* boolean String methods (mostly used in if statements) */


//        .isEmpty () ---> returns true if string is empty (index of 0); returns false if else

        String a = ""; //index = 0
        String a2 = "I";// index = 1
        String a3 = "     ";// index = 5 (only spaces)

        System.out.println(a.isEmpty());// ---> true
        System.out.println(a2.isEmpty());// ---> false

        System.out.println("-------------------------------------------------------------");

        //-------------------------------------------------------------------------------------

//        .isBlank() ---> returns true if string is blank (contains no char, only spaces); returns false if else

        System.out.println(a.isBlank());// true
        System.out.println(a3.isBlank());// true
        System.out.println(a2.isBlank());// false
//        if is.Empty()==true ; isBlank()==true

        System.out.println("-------------------------------------------------------------");

        //-------------------------------------------------------------------------------------

//        .equals() ---> checks if two strings are equal (caseSensitive)

        String b = "Java";
        String b2 = "Java";
        String b3 = "java";

        System.out.println(b.equals(b2));//true
        System.out.println(b.equals(b3));//false

//        .equalsIgnoreCase() ---> checks if two strings are equal (w/out caseSensitivity)

        System.out.println(b.equalsIgnoreCase(b3));//true
        System.out.println("-------------------------------------------------------------");

        //-------------------------------------------------------------------------------------

//        .contains( str ) ---> checks if given str is contained in String (caseSensitive)

        String c = "My name is Almi and I am studying Java now";

        System.out.println(c.contains("Almi"));// ---> true
        System.out.println(c.contains("Cydeo"));// ---> false

        System.out.println("-------------------------------------------------------------");

        //-------------------------------------------------------------------------------------

//        .startsWith( str ) ---> checks if String starts with given str (caseSensitive)

        System.out.println(c.startsWith("My"));// true

//        .endsWith( str ) ---> checks if String ends with given str (caseSensitive)

        System.out.println(c.endsWith("now"));// true


        //-------------------------------------------------------------------------------------












    }

}
