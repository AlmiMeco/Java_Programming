package day12_customMethods;

public class EmailTask1 {
    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";

        String firstName = email.substring(0, email.indexOf("_"));// ---> mike
//               starting at index '0' and ending before the '_' ---> firstName

        String lastName = email.substring(email.indexOf("_") + 1,  email.indexOf("@"));// ---> tyson
//               starting + 1 after '_' and ending before the '@' ---> lastName

        String domain = email.substring(email.indexOf("@"));// ---> @gmail.com
//               starting at '@' to the end of the string         ---> domain

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(domain);

        System.out.println(lastName + "_" + firstName + "" + domain);
//       re-formatted to lastName_firstName@domain
    }

}
/*
Assume that email address is constructed by person's first name and followed by an underscore and last name.
        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.
            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */