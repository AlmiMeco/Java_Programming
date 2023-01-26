package day29_inheritance.animalTask;

public class Dog extends Animal{ // Dog is Child : Animal is Parent
//    Dog inherits all features (variables and methods) of Animal

 public void method(){
     System.out.println(name);
     System.out.println(breed); // 6 instance variables inherited from Animal
     System.out.println(gender);
     System.out.println(age);
     System.out.println(size);
     System.out.println(color);

     setInfo("Balo", "Pit-Bull", 'M', "Large", "Brown", 3);
     eat();
     drink();
     sleep();
     toString();

 }

 public void bark(){
     System.out.println(this.name + " is barking"); // new method created for Dog class

 }

}
/*
 6 Variables
 5 Methods
 inherited from Animal
 */