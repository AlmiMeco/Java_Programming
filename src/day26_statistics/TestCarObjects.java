package day26_statistics;

public class TestCarObjects {

    public static void main(String[] args) {


        Car car1 = new Car("Audi", "A6", "Red", 2019, 75000);
        Car car2 = new Car("BMW", "M6");
        Car car3 = new Car("Honda");
        Car car4 = new Car("Honda", "Accord", "White", 2021);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

//        missing / empty elements == 'null' || '0'




    }

}
