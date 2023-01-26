package day34_oopAbstractionCont.animalTask;

public abstract class Animal {


    private String name, breed, color;
     char gender;
    private int age;

    public Animal(String name, String breed, String color, char gender, int age) {
        setName(name);
        setBreed(breed);
        setColor(color);
        this.gender=gender;
        setAge(age);
    }

    protected Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getGender() {
        return gender;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    public void drink(){ // basic method for all subclasses (all animals drink water)
        System.out.println(name + " is drinking water");
    }

    public void eat(){   // method that requires overriding (animals eat different food)
        System.out.println(name + " is eating...");
    }

//    |New Abstract Methods|
    public abstract void poop();


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

}
