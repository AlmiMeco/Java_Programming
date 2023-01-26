package day08_ternariesAndSwitch;

public class SwitchIntro {

    public static void main(String[] args) {

        char grade = 'L'; // we will compare this 'grade' with (A,B,C,D,F)
        String result = "";

        // we have many ways of completing this task, we can use Multi-Branch If... or we can use Switch Statement

        /*
        if (grade == 'A'){
            result = "Excellent";
        }else if (grade == 'B'){
            result = "Great Job";
        }else if(grade == 'C'){                   (MULTI-BRANCH IF)
            result = "Good";
        }else if(grade == 'D'){
            result = "Passed";
        }else {
            result = "Failed";
        }
         */

        switch (grade){

            case 'A':                             //the constant ('A') must match the variable (char to char)...
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Great");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Fail");
                break; // w/out the break statement... the switch will continue to execute code
                      // resulting in EVERY print statement being exec.

            default:
                System.out.println("Invalid");
                // default  triggers if all prev case statements are not executed (default should be last in the block)
        }



        //Swtch statement benefits over Multi-If... switch is faster (useful for long blocks of code)

    }

}
