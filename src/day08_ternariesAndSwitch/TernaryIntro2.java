package day08_ternariesAndSwitch;

public class TernaryIntro2 {

    public static void main(String[] args) {

        int num = -56;
        // positive, negative, or zero (if - elseIf - else) ----> Ternary

        String r = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println(r);

        //                               : else[:] (condition) if[?]

        // a trick is if you see ... :( ... inside of the Ternary it is an Else-If statement

        System.out.println("-------------------------------------");


        int d = 6;

        String weekday = (d == 1) ? "Monday" : (d == 2) ? "Tuesday" : (d == 3) ? "Wednesday" : (d == 4) ? "Thursday"
                : (d == 5) ? "Friday" : (d == 6) ? "Saturday" : "Sunday";

        System.out.println(weekday);




    }


}
