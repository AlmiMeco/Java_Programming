package day11_stringCont;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first String");

        System.out.println();
        String r1 = input.nextLine();

        System.out.println("Enter the second String");
        String r2 = input.nextLine();

        if (r1.length() > r2.length()){
            System.out.println("first is the longest");
        }else if (r1.length() < r2.length()){
            System.out.println("second is the longest");
        }else {
            System.out.println("Equal");
        }

input.close();
    }

}
/*
Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string,
			        if both have the same number of characters then print "Equal"
 */