package day04_concatenation;

public class PrimitiveTypeCastings {
    public static void main(String[] args) {

        //=================Implicit Casting================

        byte a = 15;
        short b = a;

        System.out.println(a);
        System.out.println(b);
        // because 'byte' is smaller than 'short' (by range of value) it can automatically "Implicitly" be cast

        long d = 3000l;
        float f = d;               // implicitly (automatically) cast ; no manual config needed
        System.out.println(f);

        //================Explicit Casting===================
        System.out.println("-----------------------------------------------------------------");
        int x = 100;
                              // int is larger than byte (by range of value)
        byte y = (byte) x;
                              // best practice when explicitly casting types is to cast it onto itself
        float z = 20.8f;
        short q = (short) z;

        System.out.println(y);
        System.out.println(q); // because short cant print decimals the output is 20 instead of 20.8

        double n1 = 2.5;
        byte n2 = (byte) n1;
        System.out.println("n1 = " + n1);     // same goes for double to byte ; byte can't print decimals
        System.out.println("n2 = " + n2);



    }


}
