package day08_ternariesAndSwitch;

public class TernaryIntro {

    public static void main(String[] args) {


        int score = 44;
        String result = "";

        //traditional way (IF and ELSE)...
/*
        if (score >= 60) {
            result = "Passed";
        }else{
            result = "Failed";
        }
        System.out.println(result);
*/
        //using Ternaries...

        String result2 = (score >= 60) ? "Passed" : "Failed";
        //( variable ) = ( condition ) { if } ( statement1 ) { else } ( statement2 ) ;   [pg16 notes]

        System.out.println(result2);

        System.out.println("-----------------------------------------------------");

        int age = 11;

        String r = (age >= 21) ? "Eligible" : "Not Eligible";

        System.out.println(r);



    }


}
