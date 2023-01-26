package day25_constructor;

public class Employee {


    public String name;
    public String jobTitle;
    public String hiredDate;
    public int age;
    public char gender;
    public double salary;


//    |toString method (allows print-out)|
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", hiredDate='" + hiredDate + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }

//    |Parameterized Constructor|
    public Employee(String name, String jobTitle, String hiredDate, int age, char gender, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.hiredDate = hiredDate;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }
}
