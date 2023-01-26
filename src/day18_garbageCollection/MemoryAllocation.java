package day18_garbageCollection;


class Car {

    public String color;
    public String brand;
    public String model;


} // class is not stored in JVM memory (day 17)


public class MemoryAllocation {


    public static void main(String[] args) {

        int a = 100;
//         stack

        Car car = new Car();
//       stack  =   heap (including all objects of Car() ---> color, brand, model)

    }

    public static void method1() {

        int b = 200;
//         stack

    }

    public static void method2() {

        String c = "Hello World";
//         String c ---> stack  :  "Hello World" ---> heap

    }


}
