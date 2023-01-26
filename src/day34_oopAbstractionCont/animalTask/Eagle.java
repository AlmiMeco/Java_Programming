package day34_oopAbstractionCont.animalTask;

public class Eagle extends Animal implements Flyable {


    public Eagle(String name, String breed, String color, char gender, int age) {
        super(name, breed, color, gender, age);
    }

    @Override
    public void poop() {
        System.out.println(getName() + " is pooping in the sky");
    }

    @Override
    public void flying() {
        System.out.println("Albanian Eagle " + getName() + " is flying");
    }
}
