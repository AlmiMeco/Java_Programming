package day17_customClass;

public class Employee {


    public String name;
    public String job;
    public String employeeID;
    public int age;
    public char gender;
    public double salary;

    public void setInfo(String name, String job, String employeeID, int age, char gender, double salary) {
        this.name = name;
        this.job = job;
        this.employeeID = employeeID;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }


    public String toString() {
        return "Employee" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary ;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    public void quit(){
        System.out.println(name + " has quit");
    }

    public void callOut(){
        System.out.println(name + " called out");
    }
}
