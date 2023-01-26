package day28_oopEncapsulation.encapsulation;

public class Test {
    public static void main(String[] args) {


        Student student = new Student();

        student.age = 21; // ---> accessible bc age is public

//        student.name();    ---> not accessible bc name is private


        student.setName("Almi");               // sets value

        System.out.println(student.getName()); // reads value

    }
}
