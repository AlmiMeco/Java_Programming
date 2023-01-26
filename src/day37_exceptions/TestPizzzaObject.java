package day37_exceptions;

import day34_oopAbstractionCont.carTask.Tesla;
import day36_polymorphismCont.phoneTaskExport.IPhone;

public class TestPizzzaObject {

    public static void main(String[] args) {


        Pizza pizza1 = new Pizza('S', 2, 3);

        Pizza pizza2 = new Pizza('S', 2, 3);

        Pizza pizza3 = new Pizza('L', 3, 4);

        //Pizza pizza2 = new Pizza('S', 2, 3);

        System.out.println(pizza1 == pizza2); // false : the == operator compares if they are the same object

        System.out.println(pizza1.equals(pizza2)); // true : the .equals() method that WE created checks if param are met

        System.out.println("--------------------------------------------------------------------------------------------");
//  ====================================================================================================================
        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println(pizza1.equals(pizza3)); // false
        System.out.println(pizza1.equals(100)); // Invalid Object : only 'Pizza' objects are allowed to be compared



    }
}
