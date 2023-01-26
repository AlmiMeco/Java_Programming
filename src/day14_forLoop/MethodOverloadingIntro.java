package day14_forLoop;

public class MethodOverloadingIntro {

    /* method overloading you can REUSE method names if the parameter is different ( dataType / Quantity ) */

    public static void methodA(){

    }                      // base methodA

    public static void methodA(int a){

    }                     //methodA w/ int dataType

    public static void methodA(double b){

    }                     //methodA *different dataType* double

    public static void methodA(int a, int b){

    }                     //methodA two variables *int*
}
