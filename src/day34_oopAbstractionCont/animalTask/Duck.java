package day34_oopAbstractionCont.animalTask;

public class Duck extends Animal implements Playable, Swimmable{

    public Duck(String name, String breed, String color, char gender, int age) {
        super(name, breed, color, gender, age);
    }

    @Override
    public void poop() {
        System.out.println(getName() + " is pooping on a Car");
    }

    @Override
    public void playTime() {
        System.out.println(getName() + " is playing in the bird bath");
    }

    @Override
    public void swimming() {
        System.out.println("Duck is swimming in the lake");
    }
}
