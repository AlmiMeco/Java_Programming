package day09_scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter full name: ");
        String fullName = input.nextLine();

        //input.nextLine(); nextLine() back to back is not needed to be separate

        System.out.println("Enter School Name: ");
        String schoolName = input.nextLine();

        System.out.println();


input.close();
    }
}
