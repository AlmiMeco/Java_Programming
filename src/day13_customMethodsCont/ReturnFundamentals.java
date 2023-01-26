package day13_customMethodsCont;

public class ReturnFundamentals {
    public static void main(String[] args) {
     /* (return;) statements will end the execution of a method : once the return statement is exe.
      ...the code block is finished for that specific method  */

       eligible(313);


        System.out.println(maxNum(233,23));

        minNum(12,32);

    }

    public static void eligible(int age){
        if (age < 0 || age > 130) {
            System.err.println("INVALID INPUT ---> " + age);
            return;// return here is used to EXIT the method (no other code fragments are executed)
        }

        if (age >= 21) {
            System.out.println("You are Eligible");
        }else {
            System.out.println("You are not Eligible");
        }
    }


//    int returnType
    public static int maxNum (int num1, int num2){
        if (num1 > num2 ) {
            return num1;
        }//else {... the else block here is redundant 2nd return would be triggered if 1st isn't
            return num2;

    }


//    void returnType (more logical for this instance)
    public static void minNum (int n1, int n2){
        if (n1 < n2) {
            System.out.println(n1);
        }else {
            System.out.println(n2);
        }
    }







}
