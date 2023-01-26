package day36_polymorphismCont;

import day34_oopAbstractionCont.animalTask.Animal;
import day34_oopAbstractionCont.animalTask.Dog;
import day34_oopAbstractionCont.animalTask.*;

public class ReferenceTypeCasting {

    public static void main(String[] args) {


//    |UpCasting (default)|

        Animal animal1 = (Animal) new Dog(); // implicitly done : (Dog) is cast to (Animal)
//                     ^^^-- Cast Operator (in grey bc implicit)


//    |DownCasting|
        Dog dog1 = (Dog) animal1;   // explicitly done : (animal) is cast to (Dog)
//              ^^^-- Cast Operator

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------


//        universal method (Animal superClass)
        animal1.eat();

//        method called from (Dog subClass)
        ((Dog) animal1).playTime();





    }
}
