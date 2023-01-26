package day06_ifStatements;

public class IfStatementsIntro {
    public static void main(String[] args) {

        int number = 10;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero     = number == 0;

        if(isPositive) {
            System.out.println(number + " is positive"); //this statement can only be printed if the condition is met
        }
       if (isNegative){
           System.out.println(number + " is negative");
       }
       if (isZero){
           System.out.println(number + " is zero");
       }

       // now we have 3 if statements only the statement(s) that meet the condition(s) of the If Statement will be printed

        System.out.println("------------------------------");
//         vvvvvvvvvv---- you can directly input a boolean statement (num > 0) to save time
       if (number > 0){
           System.out.println( number + " is positive");

       }
    }
}
