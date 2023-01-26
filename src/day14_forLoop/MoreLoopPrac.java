package day14_forLoop;

import java.util.Scanner;

public class MoreLoopPrac {
    public static void main(String[] args) {

                        /* ===================FOR LOOP SHORTCUT================= */
//        'fori' ---> for loop pre built statement

        Scanner input = new Scanner(System.in);
        int sum = 0;

//        sum of 5 numbers (input from scanner)
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            sum += input.nextInt();
        }

        System.out.println("sum = " + sum);
        System.out.println("------------------------------------------------");









    }

}
