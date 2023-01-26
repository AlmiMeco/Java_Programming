package day12_customMethods;

import java.util.SortedMap;

public class FormatFullName {
    public static void main(String[] args) {

        String firstName = "cyDEo"; //0 1 2 3 4
        String lastName = "sCHOOL"; //0 1 2 3 4 5

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
//                       makes 'c' uppercase (index = 0)    +   makes the rest of the string lowercase

        System.out.println(firstName);


        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(lastName);

        System.out.println(firstName + " " + lastName);





    }

}
/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)
	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";
	                    output:
	                        Cydeo School
 */