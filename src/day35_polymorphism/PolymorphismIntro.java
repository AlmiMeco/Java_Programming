package day35_polymorphism;


import day34_oopAbstractionCont.animalTask.Cat;
import day34_oopAbstractionCont.animalTask.Dog;
import day34_oopAbstractionCont.animalTask.*; // * - imports whole pkg
import day34_oopAbstractionCont.carTask.Car;
import day34_oopAbstractionCont.carTask.Tesla;

import java.util.Arrays;

public class PolymorphismIntro {


    public static void main(String[] args) {


       Dog dog = new Dog("Balo", "PitBull", "Brown", 'M', 3);
        Cat cat = new Cat("Bela", "Corso", "Black", 'F', 4);

        Lion lion = null;
        Tesla tesla = new Tesla("Model Plaid", 2021, "Blue", 135000);

//        (super)               (sub)
        Animal[] animals = { dog, cat, lion };
//       [Parent]=Array of {Child} Objects

        /* All OBJECTS (child classes) are just different forms (Polymorphism) of ANIMAL (parent class) */

        Duck duck = null;
        Shark shark = new Shark("Simie", "Great White", "Grey", 'M', 14);
        Turtle turtle = null;
        Dog dog2 = null;
        Lion lion2 = null;

        Swimmable[] animalsThatCanSwim = {shark, turtle, dog2, lion2, duck};

        System.out.println(Arrays.toString(animalsThatCanSwim));

        shark.swimming();
        shark.poop();
        shark.jawz();

        System.out.println("------------------------------------------------------------------------------------------");

//        | instance of keyword {returns true/false} |    * true -> they all have an IS-Relationship w/ eachother *
        System.out.println( cat instanceof Animal );
        System.out.println( tesla instanceof Car);
        System.out.println(shark instanceof Swimmable);

        System.out.println("------------------------------------------------------------------------------------------");

//        | instance of keyword -> false |               * cat is not having an IS-Relationship w/ Swimmable interface *
        System.out.println(cat instanceof Swimmable);

    }



}
