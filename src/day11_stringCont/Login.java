package day11_stringCont;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your User Name");
        String userName = input.nextLine();

        System.out.println("Enter your Password");
        String password = input.nextLine();

        if(userName.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("You are now logged in");
        }else{
            System.err.println("Incorrect username or password. Please try again");
        }


input.close();
    }

}
/*
Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password. Please try again"
			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon
 */