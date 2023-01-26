package day07_ifStatementsCont;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 40;

        if (score >= 60) {
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
        /*
        using this method we can accurately identify Passed/Failed scores
        but it is flawed... there is no floor/ceiling (-38 & 348) both result in -->
        (Failed/Passed)
         */

        System.out.println("---------------------------------------------------------------");

        //nested if statement

        int score2 = 342;

        if (score2 >= 0 && score2 <= 100) { //if this criteria1 is met (NEST/PRECONDITION)
            if (score2 >= 60) {             //if score is grater to / equal to 60 & criteria1 is met
                System.out.println("Passed");
            }else {                         //if score is less than 60 & criteria1 is met
                System.out.println("Failed");
            }
        }else {                             //if criteria1 is NOT met
            System.out.println("Invalid Score");
        }





    }
}
