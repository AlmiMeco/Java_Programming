package day19_array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysLiteral {
    public static void main(String[] args) {


        /* Initializing arrays with their values specified (Array Literal) : only use if you know # of elements and their values*/

        int[] numbers = {10, 29, 13, 71}; // 4 elements
//       index number =  0  1  2  3

        System.out.println(Arrays.toString(numbers));
//       ---> [10, 29, 13, 71]

        System.out.println("--------------------------");

        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//            index numbers --->     0          1           2            3         4          5           6

        System.out.println(daysOfTheWeek[4]);
//        ---> Friday

        System.out.println("-----------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Input number (1-7)");
        int day = input.nextInt();

        System.out.println(daysOfTheWeek[day - 1]); // day number - 1 = index number of correct day

        input.close();
    }

}
