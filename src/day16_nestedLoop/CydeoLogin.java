package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String r = input.next();

        System.out.println("Enter your password:");
        String p = input.next();

        if (r.contains("Cydeo") && p.contains("WoodenSpoon")) {
            System.out.println("***LOGGED IN***");
        }else {
            for (int i = 0; i < 3; i++) {

                System.err.println("***Incorrect username or password***");
                System.out.println("Enter your username:");
                r = input.next();

                System.out.println("Enter your password:");
                p = input.next();

                if (r.contains("Cydeo") && p.contains("WoodenSpoon")) {
                    System.out.println("***LOGGED IN***");
                    break;
                }

            }

        }

input.close();
    }


}
/*
Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application,
assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials
                if all three attempts are failed, then print "Your account is lucked."
*/