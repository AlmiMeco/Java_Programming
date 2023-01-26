package day31_methodOverriding.animal_methodOverriding;

public class Dog extends Animal{


    public Dog(String name, String breed, String color, char gender, int age) {
        super(name, breed, color, gender, age);
    }

    public void eat(){
        System.out.println(getName() + " is eating meat");
    }

}
