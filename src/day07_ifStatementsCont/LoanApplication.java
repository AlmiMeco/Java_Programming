package day07_ifStatementsCont;

public class LoanApplication {
    public static void main(String[] args) {

        int salary = 225000,
                creditScore = 770;

        if (salary >= 45000 && creditScore >= 700) {
            System.out.println("eligible for loan");
        }else{
            System.out.println("not eligible for loan");// if the criteria is met "IF" is executed, if not "ELSE" is executed
        }





    }
}
/*
Create a class named LoanApplication. two variables named salary and createdScore are declared and given,
write a program that can check if the person is eligible to apply for a loan
            Note:In order to be eligible for a loan:
                    1. salary: at least 45K
                    2. credit score: at least 700

 */