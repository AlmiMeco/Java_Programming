package day10_string;

import java.util.Scanner;

public class ShippingAddressWithScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        System.out.println("Your full name is: " + fullName);

        System.out.println("Enter house number");
        String houseNumb = input.next();
        System.out.println("Your house number is: " + houseNumb);

        System.out.println("Enter your street name");
        input.nextLine(); //to clear the scanner cache
        String street = input.nextLine();
        System.out.println("Your street name is: " + street);

        System.out.println("Enter your city");
        String city = input.nextLine();
        System.out.println("Your city is: " + city);

        System.out.println("Enter your State");
        String state = input.nextLine();
        System.out.println("Your State is: " + state);

        System.out.println("Enter your Zip Code");
        String zip = input.nextLine();
        System.out.println("Your Zip Code is: " + zip);

        System.out.println("--------------------------------------");

        System.out.println("Your Shipping Adress is: \n" + fullName + "\n" + houseNumb + " " + street + "\n"
        + city + ", " + state + " " + zip );

input.close();
    }
}
/*
Create a class named ShippingAddress and ask the user to:
	        1.1 Enter your full name ( nextLine() )
	        1.2 Enter your building number ( next() )
	        1.3 Enter your Street name ( nextLine() )
	        1.4 Enter your city name ( nextLine() )
	        1.5 Enter your state ( nextLine() )
	        1.6 Enter your zip code ( next() )
	        1.7 Display the shipping address
	                Ex:
	                    Your shipping address is:
	                        John Smith
	                        7925 Jones Branch Dr
	                        McLean, VA 22012
 */
