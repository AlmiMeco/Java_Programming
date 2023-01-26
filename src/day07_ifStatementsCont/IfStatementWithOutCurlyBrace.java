package day07_ifStatementsCont;

public class IfStatementWithOutCurlyBrace {
    public static void main(String[] args) {

        int age = 21;

        if (age >= 21) {
            System.out.println("ELIGIBLE");
        }else {
            System.out.println("NOT ELIGIBLE");
        }


        System.out.println("--------------------------------------");


        if (age >= 21) System.out.println("ELIGIBLE");//no curly brace is necessary, but you can only do this if you have ONE statement
        else System.out.println("NOT ELIGIBLE"); // again only one statement

        System.out.println("--------------------------------------");

        //more than 2 statements ("Eggs" and "Orange") REQUIRE curly braces

        int num = 2;

        if (num == 1) {
            System.out.println("Eggs");            // more than one statement
            System.out.println("Orange");          // more than one statement
        }else if (num == 2) {
            System.out.println("Milk");
            System.out.println("Onion");
        }else {
            System.out.println("Apple");
            System.out.println("Cherry");

        }




    }
}
