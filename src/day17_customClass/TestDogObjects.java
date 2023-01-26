package day17_customClass;

public class TestDogObjects {
    public static void main(String[] args) {


        /* dog1 + dog2 variables manually assigned; dog3 variables assigned using custom class
        ... using custom classes saves time when assigning multiple DIFFERENT variable to different methods.

            When calling upon a method ( dog1.drink() ) the Instance Variables stored under dog1 will be applied
          ... (Balo is drinking)*/


        Dog dog1 = new Dog();

//        |Instance Variable|

        dog1.name = "Balo";
        dog1.breed = "Pit-bull";
        dog1.age = 6;
        dog1.color = "Brown";
        dog1.size = "Large";

//        |Instance Method|

        dog1.drink();

//        |Printing dog1 custom class using ( .toString() )|

        System.out.println(dog1);

        System.out.println("-------------------------------------------------------------------------");

//        Second dog object (dog2); using custom Dog Method

        System.out.println("-------------------------------------------------------------------------");

        Dog dog2 = new Dog();

        dog2.name = "Alfie";
        dog2.breed = "Golden Retriever";
        dog2.age = 3;
        dog2.color = "Golden";
        dog2.size = "Large";

        dog2.eat();

        System.out.println(dog2);

        System.out.println("-------------------------------------------------------------------------");

//        |Third Dog| (using custom method)

        System.out.println("-------------------------------------------------------------------------");


        Dog dog3 = new Dog();

        dog3.setDogInfo("Jax", "Husky", "White", "Medium", 12);

        System.out.println(dog3);

        dog3.sleep();












    }

}
