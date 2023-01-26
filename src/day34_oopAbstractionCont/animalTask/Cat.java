package day34_oopAbstractionCont.animalTask;

public class Cat extends Animal implements Playable{


    public Cat(String name, String breed, String color, char gender, int age) {
        super(name, breed, color, gender, age);
    }

    @Override
    public void poop() {
        System.out.println(getName() + " is pooping in the litter");
    }

    @Override
    public void playTime() {
        System.out.println(getName() + " is playing with these Demons");
    }
}
