package day06_ifStatements;

public class IdentifyNumber {
    public static void main(String[] args) {

        int number = 1032;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        System.out.println(number + " is a positive number: " + isPositive);
        System.out.println(number + " is a negative number: " + isNegative);
        System.out.println(number + " is zero:              " + isZero);


    }
}
/*
2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.
			Ex:
				number = 200
			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: fals
 */