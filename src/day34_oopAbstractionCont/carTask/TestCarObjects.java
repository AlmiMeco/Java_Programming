package day34_oopAbstractionCont.carTask;

import day33_abstraction.Teacher;

public class TestCarObjects {
    public static void main(String[] args) {


        Honda honda = new Honda("Accord", 2012, "White", 13700);

        System.out.println(honda);
        honda.start();
//        ---> Honda{, model='Accord', year=2012, color='White', price= $13700}
//             Insert key and twist to start Honda Accord

        System.out.println("=========================================================================================");

        Audi audi = new Audi("A7", 2021, "Red", 68477);
        System.out.println(audi);
        audi.start();
//        ---> Audi{, model='A7', year=2021, color='Red', price= $68477}
//             Press the Start button to start Audi A7

        System.out.println("=========================================================================================");

        Tesla tesla = new Tesla("Plaid", 2022, "Black", 153000);
        System.out.println(tesla);
        tesla.start();
//        ---> Tesla{, model='Plaid', year=2022, color='Black', price= $153000}
//             Say "Start" to start Tesla Plaid

        System.out.println("=========================================================================================");

        honda.stop();  // Press the brake to stop Honda Accord
        audi.stop();  //  Press the brake to stop Audi A7
        tesla.stop();//   Press the brake to stop Tesla Plaid

    }
}
