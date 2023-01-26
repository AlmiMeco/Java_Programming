package day11_stringCont;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String r = input.next();

        if (r.length() >= 1) { // if the string is at least 1 character long
            char a = r.charAt(0); // the first character of the string

            if (a >= '0' && a <= '9') {
                System.out.println("First char is a digit");
                
            } else if (a >= 'A' && a <= 'Z') {
                System.out.println("First char is an UpperCase letter");
                
            } else if (a >= 'a' && a <= 'z' ) {
                System.out.println("First char is a LowerCase letter");

            } else {
                System.out.println("first character is special character");

            }

        }else {
            System.out.println("Empty String"); //if line 13 requirements are not met (String >= 1)
        }


input.close();
    }

}
/*
 Create a class named DigitLetterSpecialChar and wirte a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"
        	HINT: You need to check the ascii table

 */