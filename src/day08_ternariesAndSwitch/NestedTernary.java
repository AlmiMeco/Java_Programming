package day08_ternariesAndSwitch;

public class NestedTernary {


    public static void main(String[] args) {

        int score = 85; //determine weather score is passing (>60), failing (<60), or invalid

        String r = (score >= 0 && score <= 100) ?  //Nest
                (score >= 60) ? "Passed" : "Failed"
                : "Invalid";

        System.out.println(r);


        // Best practice is for "Nested" statements... use Nested If, it's better to not use Ternaries








    }

}
