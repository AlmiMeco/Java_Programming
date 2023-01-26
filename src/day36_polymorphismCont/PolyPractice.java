package day36_polymorphismCont;

import day36_polymorphismCont.phoneTaskExport.IPhone;
import day36_polymorphismCont.phoneTaskExport.Phone;
import day36_polymorphismCont.phoneTaskExport.Samsung;
import day36_polymorphismCont.phoneTaskExport.Nokia;

public class PolyPractice {

    public static void main(String[] args) {


//    | Array of Different Phones|

//     ref type[] variable = {obj}
        Phone[] phones = {
                new IPhone("Iphone 11 Pro", "Black", 'L', 900),
                new IPhone("Iphone 12 Pro Max", "Gold", 'L', 1200),
                new IPhone("Iphone 9", "Gold", 'L', 800),
                new Samsung("Galaxy S19", "Pink", 'L', 700),
                new Samsung("Galaxy S20", "Silver", 'L', 850),
                new Samsung("Galaxy S21", "Silver", 'L', 950),
                new Nokia("XR20", "Silver", 'L', 350),
                new Nokia("G10", "Black", 'L', 99),
                new Nokia("G50", "Silver", 'L', 250),
                new IPhone("Iphone 12 Pro", "Black", 'L', 1200),
                new IPhone("Iphone 11 Pro Max", "Silver", 'L', 1100),
                new Samsung("Galaxy S18", "White", 'L', 750),
                new Samsung("Galaxy S17", "Silver", 'L', 650),
                new Nokia("G10", "Black", 'L', 99),
                new IPhone("Iphone 6", "Gold", 'L', 400),
                new IPhone("Iphone 7", "White", 'L', 500)
        };


        System.out.println("===========================================================================================");

//        | 1. |
        for (Phone eachPhone : phones) {
            System.out.println(eachPhone.getModel() + " - " + eachPhone.getColor() + " - " + eachPhone.getPrice());
        }

        //Iphone 11 Pro - Black - 900
        //Iphone 12 Pro Max - Gold - 1200
        //Iphone 9 - Gold - 800
        //Galaxy S19 - Pink - 700
        //Galaxy S20 - Silver - 850
        //Galaxy S21 - Silver - 950
        //XR20 - Silver - 350
        //G10 - Black - 99
        //G50 - Silver - 250
        //Iphone 12 Pro - Black - 1200
        //Iphone 11 Pro Max - Silver - 1100
        //Galaxy S18 - White - 750
        //Galaxy S17 - Silver - 650
        //G10 - Black - 99
        //Iphone 6 - Gold - 400
        //Iphone 7 - White - 500

        System.out.println("===========================================================================================");

//        | 2. |
        int numberOfApple = 0;

        for (Phone eachPhone : phones) {

            if (eachPhone instanceof IPhone) {
                numberOfApple++;
            }

        }
        System.out.println(numberOfApple);
//        ---> 7 (7 objects that have relation to IPhone Class)


        System.out.println("===========================================================================================");


//        | 4. |
        for (Phone eachPhone : phones) {
            if (eachPhone instanceof Samsung && eachPhone.getPrice() > 700) {
                System.out.println(eachPhone.getModel());
            }

            if (eachPhone instanceof IPhone && eachPhone.getPrice() > 700) {
                System.out.println(eachPhone.getModel());
            }
        }

//      Iphone 11 Pro
//      Iphone 12 Pro Max
//      Iphone 9
//      Galaxy S20
//      Galaxy S21
//      Iphone 12 Pro
//      Iphone 11 Pro Max
//      Galaxy S18


//======================================================================================================================


        //Iphone 11 Pro - Black - 900
        //Iphone 12 Pro Max - Gold - 1200
        //Iphone 9 - Gold - 800
        //Galaxy S19 - Pink - 700
        //Galaxy S20 - Silver - 850
        //Galaxy S21 - Silver - 950
        //XR20 - Silver - 350
        //G10 - Black - 99
        //G50 - Silver - 250
        //Iphone 12 Pro - Black - 1200
        //Iphone 11 Pro Max - Silver - 1100
        //Galaxy S18 - White - 750
        //Galaxy S17 - Silver - 650
        //G10 - Black - 99
        //Iphone 6 - Gold - 400
        //Iphone 7 - White - 500

    }
}
/*  1. print the model, color and price of each phone object in the following format
    				model - color - price

	2. How many Iphones in the array of phones?

	3. How many Samsungs in the array of phones?

	4. Display the models of Iphones and samsung that has the price of 700 or greater

*/