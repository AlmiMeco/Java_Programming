package day31_methodOverriding.animal_methodOverriding;

public class Cat extends Animal{


    public Cat(String name, String breed, String color, char gender, int age) {
        super(name, breed, color, gender, age);
    }

//    | Overriden Method |
    @Override // <-- override annotation : checks if Overrden Method will compile (optional)
    public void eat(){
        System.out.println(getName() + " is eating cat food");
    } // --> Same accessModifier {public} & same returnType {void}


    public static void main(String[] args) {

        Cat cat = new Cat("Jimball", "Saimese", "White", 'F', 4);

        System.out.println(cat);
        cat.drink();
        cat.eat();

    }

}
