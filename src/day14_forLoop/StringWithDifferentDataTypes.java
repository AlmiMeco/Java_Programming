package day14_forLoop;

public class StringWithDifferentDataTypes {
    public static void main(String[] args) {

//        String r = true;  does not work (compile error) 'true' is boolean data type

        String r = "" + true; //concating the desired dataType to an empty string ("") allows you to use other dataTypes
        System.out.println(r);// ---> true

        System.out.println("-----------------------------------------------------");

        String a = "" + 13;
        System.out.println(a);

    }
}
