package day09_scanner;

import java.util.Scanner;


public class ScannerString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to continue");

        //String answer = input.next(); :: this method will only print ONE word (after SPACE the scanner stops)


        System.out.println("----------------------------------------------");
        System.out.println("Enter String");

        String answer = input.nextLine(); // this method will allow you to print any combination of String (Hello My Name Is...)

        System.out.println("Your Input is: " + answer);




input.close();
    }

}
