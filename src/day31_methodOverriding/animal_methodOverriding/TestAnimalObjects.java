package day31_methodOverriding.animal_methodOverriding;

import day30_inheritanceCont.Employee;

import java.rmi.dgc.DGC;

public class TestAnimalObjects {

    public static void main(String[] args) {

        Cat cat = new Cat("Jimball", "Saimese", "White", 'F', 4);

        Dog dog = new Dog("Balo", "PitBull", "Brwon", 'M', 6);

        Lion lion = new Lion("Tito", "Sahara Lion", "Gold", 'F', 3);

        Eagle eagle = new Eagle("Shqipe", "Golden", "Brown", 'F', 8);

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);


        System.out.println("--------------------------------------------------------");

        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();



    }

}
