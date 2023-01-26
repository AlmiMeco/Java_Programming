package day06_ifStatements;

public class Cigarettes {
    public static void main(String[] args) {

        int age = 104;

        if (age >= 21 && age < 100){ // must be at least 21yr ; but no more than 100yr
            System.out.println("Eligible to buy Cigs");
        }

        if (age < 21 || age >= 100){
            System.out.println("Not eligible to buy Cigs");
        }





    }
}
/*
1. Create a class named Cigarettes.java
2. A variable named age is declared and given, Write a program that can check if the person is eligible to buy cigarettes
	Ex:
		age = 20
	     output:
		    You are not eligible to buy Cigarettes
 */