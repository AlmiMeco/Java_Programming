package day18_garbageCollection;

public class GarbageCollection {
    public static void main(String[] args) {

        /* two ways to allow garbage collection for the object of str1 */

        String str = "Java";
        String str1 = "Java";
        String str2 = "Python";

        System.out.println(str1);// ---> Java
        System.out.println(str2);// ---> Python
        System.out.println("-------------------------------------------------");


//        Method 1 (null)

        str1 = null;  // str1 value is null (not an obj)

//        Method 2 (Object re-assignment)

        str2 = str;  //  "Pyhton" (old object) goes to garbage collection (str2 takes inheritance of str)

        System.out.println(str1);// ---> null
        System.out.println(str2);// ---> Java


    }

}
