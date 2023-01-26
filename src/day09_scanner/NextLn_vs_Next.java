package day09_scanner;

import java.util.Scanner;

public class NextLn_vs_Next {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = input.nextInt();

        input.nextLine(); // this is here for the scanner to input the blank "enter" key (to clear the scanner memory)

        System.out.println("Enter your full name: ");

        String fullName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("full name = " + fullName);



input.close();
    }
}
