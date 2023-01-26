package day26_statistics;

public class ConstructorCalls {

    public static void method1(){
        System.out.println("method1");
    }

    public static void method2(){
        method1();
        System.out.println("method2");
    }

    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this();                                  // this() is used to call a constructor from inside another Constructor
        System.out.println("Constructor w/ int arg");
    }


    public static void main(String[] args) {

        method1();

        System.out.println("----------------------------------------------------------------------");

        method2();




    }



}
