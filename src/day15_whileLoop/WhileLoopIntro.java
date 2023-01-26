package day15_whileLoop;

import java.util.Scanner;

public class WhileLoopIntro {
    public static void main(String[] args) {

        int i = 0;

        while (i < 10) {
            System.out.println("Hello World");
            i++;
        }

        System.out.println("-------------------------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Age:");
        int age = input.nextInt();



        while ( !(age >= 1 && age <= 150) ) {
            System.err.println("Invalid entry! Please re-enter your age:"); // this will repeat the invalid entry loop
            age = input.nextInt();
        }

        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }


        input.close();

    }
}
