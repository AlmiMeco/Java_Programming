package day27_accessModifiers;

import static day27_accessModifiers.Data.*;
// ---> import statement for ALL static members

import static day27_accessModifiers.Data.method3;
// ---> import statement for {static} method3 ONLY


public class Test2 {

    public static void main(String[] args) {


        method3();

        System.out.println(d);


                       /* We can now use all static members w/out importing 'Data' class */


//        |Instance Members are NOT imported|

        /*
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        method1();
        method2();
         */



    }

}
