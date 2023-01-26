package day33_abstraction;

public class Driver extends Employee{


    private String car;

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public Driver(String name, String id, String jobTitle, int age, int salary, char gender, String car) {
        super(name, id, jobTitle, age, salary, gender);
        setCar(car);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving a " + car);
    }


    @Override
    public String toString() {
        return super.toString().replace("}", "")  +
                "car='" + car + '\'' +
                '}';
    }


}
