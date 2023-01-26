package day03_variables;

public class PrimitiveDataTypesIntro {
    public static void main(String[] args) {

        // Syntax for declaring Data  >  DataType VariableName = Data;
        //                            (int/double) (a,b,c,d..) (Desired Data Value)

        byte a = 1;
        // "byte" can only accept integers values b/w (-128 ~ 127)
        short b = 10000;
        // "short" can only accept integers values b/w (-32,768 ~ 32,767)
        int c = 150000;
        // "int" can only accept integers values b/w (-2,147,483,648 ~ 2,147,483,647)
        // "int" is the preferred data type for all whole integers (bc it encompasses many values)
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("-----------------------------------");
        double d = 2.6;
        System.out.println(d);
        // "double" is the preferred data type for decimal numbers


    }
}
// Syntax for declaring Data  >  DataType VariableName = Data;
// Data Type variables can only be used once (a,b,c,d...)