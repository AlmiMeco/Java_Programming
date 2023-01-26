package day29_inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.setInfo("Balo", "Pit-Bull", 'M', "Large", "Brown", 3);

        System.out.println(dog);
//        ---> Dog{name='Balo', breed='Pit-Bull', gender=M, size='Large', color='Brown', age=3}

        Cat cat = new Cat();
        System.out.println(cat);
//        ---> Cat{name='null', breed='null', gender= , size='null', color='null', age=0}

        Tiger tiger = new Tiger();
        System.out.println(tiger);
//        ---> Tiger{name='null', breed='null', gender= , size='null', color='null', age=0}

        System.out.println("-------------------------------------------------");


        /* Because of getClass().getSimpleName() code we can output ueach Child class name (Dog, Car, Tiger) ;
        instead of Parent Class name (Animal) for every single setInfo method */

//        |Methods Inherited from Animal (PARENT) class|

        dog.eat();
        dog.sleep();
        dog.drink();

        System.out.println("-------------------------------------------------");

        cat.eat();
        cat.sleep();
        cat.drink();

        System.out.println("-------------------------------------------------");

        tiger.eat();
        tiger.sleep();
        tiger.drink();

        System.out.println("-------------------------------------------------");

//        |Method created for Dog (CHILD) class|

        dog.bark();
        // cat.bark(); ---> Method is unique for Child Class (Dog) : can't be used for other Child Classes (Cat)



    }

}
