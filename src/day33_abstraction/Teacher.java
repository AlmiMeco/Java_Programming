package day33_abstraction;

public class Teacher extends Employee{


    public Teacher(String name, String id, String jobTitle, int age, int salary, char gender) {
        super(name, id, jobTitle, age, salary, gender);
    }

    @Override
    public void work() {
        System.out.println("The teacher begins the lesson");
    }
}
