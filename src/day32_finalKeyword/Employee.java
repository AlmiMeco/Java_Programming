package day32_finalKeyword;

public final class Employee extends Person{ // 'final' keyword ---> makes this whole Class (variables & methods) un-inheritale

    public String jabTitle;
    public int salary;

    public Employee(String name, char gender, String jabTitle, int salary) {
        super(name, gender);
        this.jabTitle = jabTitle;
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jabTitle='" + jabTitle + '\'' +
                ", salary=" + salary +
                '}';

    }
}
