package day22_arrayList;

public class WrapperClassesMethods {
    public static void main(String[] args) {


        String str1 = "20";


//        |Parse Method|
        int num = Integer.parseInt(str1); // converts the non-primitive String dataType (object) ---> primitive Int dataType

//        |valueOf Method|
        Integer num2 = Integer.valueOf(str1); // converts the non-primitive String dataType (object) ---> Wrapper Class

        /* Main difference b/w Parse & valueOf method is what is returned :
         { Parse ---> primitive value } & { valueOF ---> Wrapper Class value} */


//        |Wrapper Methods converting to Boolean|
        String s1 = "true";

        boolean s2 = Boolean.parseBoolean(s1); // ---> primitve (boolean) true
        Boolean s3 = Boolean.valueOf(s1);      // ---> Wrapper Class (Boolean) true

        /* What you cant do ...

       |Example of un-doable conversion|

        String str1 = "Wooden Spoon"
         int num1 = Integer.parseInt(str1);

         -----------------------------------------------------------------------------------

         ---> this can't be done b/c the String must be converted to a READABLE dataType...
         (true ---> boolean)
         (10   ---> int)
         (20.5 ---> double)
         ('C'  ---> char)... and so on
         YOU CANNOT CONVERT EVERY STRING to ANY dataType */


    }

}
