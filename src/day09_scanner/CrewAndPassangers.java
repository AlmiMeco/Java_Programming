package day09_scanner;

public class CrewAndPassangers {

    public static void main(String[] args) {

        //ternary

        int num = 100;

        String r = (num == 50 || num == 75 || num == 100) ?

                (num == 50) ? "20 crew, 30 passengers"
                        :(num == 75) ? "25 crew, 50 passengers"
                        : "30 crew, 70 passengers"
                : "Invalid";

        //System.out.println(r);

        //switch statement


        String result = "";


        switch (num){
            case 50:
                result = "20 crew, 30 passengers";
                break;
            case 75:
                result = "25 crew, 50 passengers";
                break;
            case 100:
                result = "30 crew, 70 passengers";
                break;
            default:
                result = "Invalid";
        }
        System.out.println(result);






    }

}
/*
Create a class named CrewAndPassengers
		Given a number of people on the ship (int number)
		determine how many need to be crew members and how many can be passengers.
		Print how many of each type there should be.
                Total: 50  ====> 20 crew, 30 passengers
                Total: 75  ====> 25 crew, 50 passengers
                Total: 100 ====> 30 crew, 70 passengers
                Any other number of people on the ship is not valid
                Solution1: Use ternary. Do not use more than one println()
                Solution2: Use switch statement. Do not use more than one println()
 */