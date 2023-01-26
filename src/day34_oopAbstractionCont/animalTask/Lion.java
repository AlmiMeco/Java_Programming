package day34_oopAbstractionCont.animalTask;

public class Lion extends Animal implements Swimmable{


    public Lion(String name, String breed, String color, char gender, int age) {
        super(name, breed, color, gender, age);
    }

    @Override
    public void poop() {
        System.out.println(getName() + "is pooping in the Zoo");
    }

    @Override
    public void swimming() {
        System.out.println("The lion is swimming to sneak up on a Zebra");
    }
}
