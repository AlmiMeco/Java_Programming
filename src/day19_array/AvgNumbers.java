package day19_array;

import java.util.Arrays;
import java.util.Scanner;

public class AvgNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int n = input.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a number");
            numbers[i] = input.nextInt();
            sum += numbers[i];

        }

        double average = sum / (double)n; // n cast to double so you can return a double result for 'average'

        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average of " + n + " numbers: " + average);



        input.close();
    }

}
/*
* AverageNumber:
	            1. Ask the user how many numbers they want to enter
	            2. get all the inputs from the user and store them into an array
	            3. Iterate the array & return the average number
*/