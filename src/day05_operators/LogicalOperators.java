package day05_operators;

public class LogicalOperators {
    public static void main(String[] args) {

        // Logical Operator (&&) Logical And
        int salary = 60000;
        int creditScore = 650;
        // true vvv                 true vvv
        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650;
        System.out.println(eligibleForLoan);
        // both criteria must be met (true) for the outcome to be true
        // salary >= 30000 (60000) -->true
        // credit score must be >= 650 (650) -->true
        //outcome --> true

        System.out.println("----------------------------------");
        String country = "Japan";
        int age = 18;
        // true          false
        boolean eligibilityToVoteUs = age >= 18 && country == "USA";
        System.out.println(eligibilityToVoteUs);
        // its false bc not all (&&) criteria are met ; country (Japan) =/= "USA"

        System.out.println("----------------------------------");
        // Logical or Operator (||)

        String answer = "maybe";

        boolean validAnswer = answer == "yes" || answer == "no";
        System.out.println(validAnswer);            // bc both are false the outcome is -->false

        // for logical or both need to be false --> false (to equal)

        System.out.println("----------------------------------");
        // Logical Not Operator (!)

        String a = "yes";
        boolean yes = a == "yes";
        boolean no = !yes;
        System.out.println("yes = " + yes); //true
        System.out.println("no = " + no); // false
        System.out.println("----------------------------------");

        int score = 65;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed); //true
        System.out.println("failed = " + failed); //false

        //adding (!) besfore a boolean expression (true/false) outputs the inverse
        // !true --> false
        // !false --> true

    }
}
/*
&& Logical AND
|| Logical OR
! Logical NOT
-------------------
(&&) Logical AND
Expression1 Expression2 Returned Value
False           False       False
False            True       False
 True           False       False
 True            True        True
 ------------------
 (||) Logical OR
 Expression1 Expression2 Returned Value
False           False       False
False            True        True
 True           False        True
 True            True        True


 */