package day34_oopAbstractionCont.animalTask;

public class Turtle extends Animal implements Swimmable{


    public Turtle(String name, String breed, String color, char gender, int age) {
        super(name, breed, color, gender, age);
    }

    @Override
    public void poop() {
        System.out.println("BRUH M");
    }

    public void pee(){
        System.out.println("LOL");
    }

    @Override
    public void swimming() {
        System.out.println("DD");
    }



    public static void main(String[] args) {
        Turtle turtle = new Turtle("ff","ff","ff",'g',23);

        turtle.poop();
        turtle.pee();


    }


}
