package day34_oopAbstractionCont.animalTask;

public class TestAnimalObj {


    public static void main(String[] args) {


        Dog dog = new Dog("Dexter", "Pit-Bull", "Black", 'M', 2);
        System.out.println(dog);

        dog.poop();     // comes from "Animal" Parent Class
        dog.playTime(); // comes from "Playable" Interface
        dog.swimming(); // comes from "Swimmable" Interface

        System.out.println(dog.getColor());





    }

}
