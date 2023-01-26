package day04_concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Daniel";
        String lastName = "Jefferson";
        System.out.println("Your full name is " + firstName + " " + lastName);

        //OR.........

        System.out.println("------------------------------------------------");

        String firstName2 = "Gypsy";
        String lastName2 = "King";
        String fullName = firstName2 + " " + lastName2; //using concatenation we have combined two variables into 1
        System.out.println("Your full name is " + fullName);

    }
}
