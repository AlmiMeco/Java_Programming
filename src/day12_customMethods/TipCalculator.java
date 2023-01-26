package day12_customMethods;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)");
        String split = input.next().toLowerCase();

        System.out.println("Enter the number of people");
        int totalPeople = input.nextInt();

        System.out.println("Enter the check amount");
        double checkAmount = input.nextDouble();

        System.out.println("Service Quality (Excellent, Great, Good, Fair, Poor");
        String qualityOfService = input.next().toLowerCase();


        double tipTotal = (qualityOfService.equals("excellent")) ? checkAmount * .25
                :qualityOfService.equals("great")? checkAmount * .2
                :qualityOfService.equals("good")? checkAmount * .15
                :qualityOfService.equals("fair")? checkAmount * .1
                :checkAmount * .05;

        double totalCheck = checkAmount + tipTotal;





        System.out.println("totalPeople = " + totalPeople);
        System.out.println("totalCheck = " + totalCheck);
        System.out.println("tipTotal = " + tipTotal);

        if (split.equals("yes")) {
            System.out.println("Total per person: " + (totalCheck / totalPeople) );
            System.out.println("Tip per person: " + (tipTotal/totalPeople)  );
        }

input.close();
    }

}
/*
 There will be different service quality benchmarks that will determine the tip given.
	    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.
	        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%
	    The program should ask the user to enter:
	            - Split or No split (Yes or No),
	             - Enter the number of people (number)
	             - Enter the check amount (number)
	             - Service Quality (String)
	    And then it should display:
	             Number of people entered
	             Total to pay
	             Total tip
	             Total per person
	             Tip per person:
		    Ex:
		        Split or No split (Yes or No)?
		        YeS
		        Enter the number of people
		        4
		        Enter the check amount:
		        476
		        How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		        ExCElLeNt
		        output:
		            Number of people entered: 4
		            Total to pay: 595.0
		            Total tip: 119.0
		            Total per person: 148.75
		            Tip per person: 29.75
 */