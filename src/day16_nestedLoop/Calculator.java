package day16_nestedLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        int i = 3;

        String answer = "yes";

        Scanner input = new Scanner(System.in);

        while (answer.equals("yes")) {

            System.out.println("Enter number 1: ");
            double n1 = input.nextDouble();

            System.out.println("Enter a math operator (-, +, *, /): ");
            char operator = input.next().charAt(0);


            while (!(operator == '/' || operator == '+' || operator == '-' || operator == '*')) {
                System.err.println("ERROR: Invalid operator. Re-Enter operator");
                operator = input.next().charAt(0);
            }

            System.out.println("Enter number 2: ");
            double n2 = input.nextDouble();


            double result = (operator == '+') ? n1 + n2 : (operator == '-') ? n1 - n2 : (operator == '*') ? n1 * n2 : n1 / n2;

            System.out.println(n1 + " " + operator + " " + n2 + " = " + result);


            System.out.println("Would you like to continue? (yes/no)");
            answer = input.next().toLowerCase();

            while (! (answer.equals("yes") || answer.equals("no"))){
                System.err.println("INVALID ANSWER: YES / NO");
                answer = input.next().toLowerCase();
            }
        }

        System.err.println("THANK YOU FOR USING ALMI'S CALCULATOR");
        input.close();
    }



}
/* Write a program for a simple calculator
			1.1 ask the user to enter first number: (double)
			1.2 ask the user to enter a math operator: (-, +, *, /)
				if the user enters invalid math operator, reapet the same step until user enters a valid operator
			1.3 ask the to enter the second number: (double)
			1.4 display the calculation result
			1.5 Would you like to continue? (Yes/No)
*/