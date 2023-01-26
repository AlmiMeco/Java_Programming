package day13_customMethodsCont;

public class WarmupTasks {
    public static void main(String[] args) {

//    Task 1
        calculate(450, 5, '/');

        System.out.println("---------------------------------------------------------------------------");

//    Task 2
        ageGroup(79);

    }

//    Task 1
    public static void calculate (double num1, double num2, char mathOperator){

        double result = 0;// declared a double (result) as a placeholder

        switch (mathOperator){

            case '+': result = num1 + num2;
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + result );
                break;

            case '-': result = num1 - num2;
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + result);
                break;

            case '/': result = num1 / num2;
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + result);
                break;

            case '*': result = num1 * num2;
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + result);
                break;

            default:
                System.err.println("INVALID OPERATOR: " + mathOperator);
        }


    }


//    Task 2
    public static void ageGroup (int age){
        if (age < 21) {
            System.out.println("Teenager");
        }else if (age >= 21 && age < 55) {
            System.out.println("Adult");
        }else{
            System.out.println("Senior");
        }
    }






}



/*
1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)
	    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"
	        Ex:
	            calculate(10, 20, '+')
	        output:
	            10 + 20 = 30
	2. Create a method named ageGroup that can print the age group of the person
	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )
 */