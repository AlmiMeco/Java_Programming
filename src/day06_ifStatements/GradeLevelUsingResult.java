package day06_ifStatements;


public class GradeLevelUsingResult {
    public static void main(String[] args) {

        //instead of having all these print statements you can only use one

        String result = ""; //temporary value (place holder)

        //using "sout" at the end of the code whichever (if statement) condition is met is assigned to the temp value ""
        //only this temp value is printed (ln 43)







        int gradeLevel = 5;

        if (gradeLevel >= 1 && gradeLevel<= 5){
            result = "Elementary School";
        }

        if (gradeLevel >=6 && gradeLevel <=8){
           result = "Middle School";

        }

        if (gradeLevel >= 9 && gradeLevel <= 12){
            result = "High School";
        }
        if (gradeLevel >= 13 && gradeLevel <= 16){
            result = "College";
        }
        if (gradeLevel >=17 && gradeLevel <=18){
            result = "Grad School";
        }
        if (gradeLevel >18){
            result = "Enough School :0";
        }
        System.out.println(result);
    }
}











