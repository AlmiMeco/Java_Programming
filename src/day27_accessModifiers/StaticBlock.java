package day27_accessModifiers;

public class StaticBlock {

    static {
        System.out.println("Static Block");  // < - - - STATIC BLOCK
    }

    public static void main(String[] args) {
        System.out.println("Main Method");

    }

          /* "Static Block" is printed first bc Static Block is always executed first by compiler */

//======================================================================================================================

    public static int a;
    public static double b;
    public static String c;

    static {
        a = 4;
        b = 10.2;
        c = "Java";
    }

//    Static variables have all their values assigned via the Static Block
}
