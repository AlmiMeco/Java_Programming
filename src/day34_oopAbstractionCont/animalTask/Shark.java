package day34_oopAbstractionCont.animalTask;

public class Shark extends Animal implements Swimmable{


    @Override
    public void poop() {
        System.out.println(getName() + " is pooping in the Ocean");
    }

    public Shark(String name, String breed, String color, char gender, int age) {
        super(name, breed, color, gender, age);
    }

    @Override
    public void swimming() {
        System.out.println("The shark is swimming towards us");
    }

    public void jawz(){
        System.out.println(getName() + " is eating the ship");
    }
}
