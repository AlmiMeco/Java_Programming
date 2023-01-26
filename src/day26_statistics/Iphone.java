package day26_statistics;

public class Iphone {

    public static String brand = "Apple";
    public String model;
    public double price;
    public static String os = "IOS";
    public static String madeIn = "China";


//    |Incorrect Static Method|
/*
    public static void finalTrim(){
        System.out.println(Model);    - - - > method CANNOT be static bc it uses 'Instance Variables' (model) +
        System.out.println(brand);
    }
*/

//    |Instance Method|

    public void finalTrim(){       // - - - > no static modifier
        System.out.println(model);
        System.out.println(brand);
    }

//    |Proper Static Method|

    public static void phoneInfo(){// - - - > static modifier with all variables also static
        System.out.println(brand);
        System.out.println(os);
        System.out.println(madeIn);
    }

    public Iphone(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
/* Attributes:
*       brand
*       model
*       price
*       os
*       madeIN
*
*   which are static vs which are instance */