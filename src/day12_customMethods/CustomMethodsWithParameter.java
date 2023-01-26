package day12_customMethods;

public class CustomMethodsWithParameter {
    public static void main(String[] args) {


        oddOrEven(7); // 7 = parameter (no need for an int variable)

        liquorEligibility(22);

    }

//    the method takes num and determines odd/even
    public static void oddOrEven(int num){         // (int num) is basically the variable declaration
        if (num % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }

//    the method determines eligibility to buy Liquor
    public static void liquorEligibility(int age){
        if (age >= 21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }
    }
}
