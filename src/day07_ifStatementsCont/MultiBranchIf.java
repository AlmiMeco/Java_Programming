package day07_ifStatementsCont;

public class MultiBranchIf {
    public static void main(String[] args) {

        //Multi-Branch If statements allow you to save computing power (ram) by going in order and only executing one
        // statement, instead of executing EVERY single-if statement... once the condition is met (true) no further
        // blocks of code are executed


        int num = 69;
        String result = "";
        // traditional way (if statements)

        if (num == 0) {
            result = "Zero";
        }
        if (num > 0) {
            result = "Positive";
        }
        if (num < 0) {
            result = "Negative";
        }
        System.out.println(result);

        System.out.println("------------------------------");

        // new way (multi-branch if statements)

        String result2 = "";

        if (num == 0) {
            result2 = "Zero";
        } else if (num > 0) {
            result2 = "Positive";
        }else{
            result2 = "Negative";
        }

        // using multi-branch if statements as soon as one of the blocks (if statements) is executed the remaining
        // are not executed

        System.out.println(result2);

    }
}
