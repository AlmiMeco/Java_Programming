package day22_arrayList;

public class WrapperClassesIntro {
    public static void main(String[] args) {

                                          /* Wrapper Classes */

        int a1 = 10;     // primitive dataType for integer
        Integer a2 = 10; // non-primitive dataType for integer (Integer is a wrapper class)

//        |Autoboxing|
        int b1 = 100;
        Integer b2 = b1; // Autoboxing {primitive ---> object}

//    each primitive dataType has it's own Wrapper Class : you MUST use the correct Wrapper Class for each primitive

        System.out.println("---------------------------------------------------");

//        |Unboxing|
        Integer c1 = 69; // non-primitive dataType (object)
        int c2 = c1;     // Unboxing {object ---> primitive}

    }

}
