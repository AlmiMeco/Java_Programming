package day28_oopEncapsulation.encapsulation;

import java.util.stream.Stream;

public class Employee {


    private double salary;
    private String name;
    private int age;
    private String jobTitle;


    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }

//    |Constructor using Setter|
    public Employee(double salary, String name, int age, String jobTitle) {
        setSalary(salary);
        setName(name);
        setAge(age);
        setJobTitle(jobTitle);
    }

    public double getSalary() {            // READ
        return salary;
    }

    public void setSalary(double salary) { // WRITE

        if (salary < 0) {
            System.err.println("Invalid Salary: " + salary); // condition for Setting salary (1+)
            System.exit(1);
        }

        this.salary = salary;
    }

    public String getName() {

        if (name == null) {
            name = "Uknown";
        } // if name is not set ---> Unknown will be printed instead of "nul"

        return name;
    }

    public void setName(String name) {

        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Employee Name cannot be empty/blank");
            System.exit(1);
        } // if name is empty/blank this if statement will terminate the code

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 18 || age > 120) {
            System.err.println("Invalid Age");
            System.exit(1);
        }

        this.age = age;
    }

    public String getJobTitle() {

        if (jobTitle.isBlank() || jobTitle.isBlank()) {
            System.err.println("Job Title is empty/blank");
            System.exit(1);
        }

        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
