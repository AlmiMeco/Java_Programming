package day34_oopAbstractionCont.animalTask;

public class Dog extends Animal implements Playable, Swimmable{

    public Dog(String name, String breed, String color, char gender, int age) {
        super(name, breed, color, gender, age);
    }

    public String Dog(String digit){
        return digit;

    }

    public Dog() {
    }

    @Override
    public void poop() {
        System.out.println(getName() + " is pooping on the carpet");
    }

//    |Implemented Method from {Playable Interface}|
    @Override
    public void playTime() {
        System.out.println(getName() + " is play fighting");
    }

    @Override
    public void swimming() {
        System.out.println("Dog is paddle swimming");
    }
}
