package day06_ifStatements;

public class SingleIfStatementPractice {
    public static void main(String[] args) {

        int number = 100;
        boolean isEven = number % 2 == 0;


        if (isEven){
            System.out.println("Is Even");
        }
        if (!isEven){
            System.out.println("Is Odd");// (!isEven) means of the numb is not even (odd) ; it will be printed
        }







    }
}
