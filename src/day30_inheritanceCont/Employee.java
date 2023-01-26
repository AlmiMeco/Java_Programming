package day30_inheritanceCont;

import java.time.LocalDate;
import java.time.LocalDateTime;
                                          /* Hierarchical Inheritance */
public class Employee extends Person {

     private String jobTitle, employeeID;
     private int salary;

    public Employee(String name, char gender, LocalDate DOB, String jobTitle, String employeeID, int salary) {
        super(name, gender, DOB);
        setJobTitle(jobTitle);
        setEmployeeID(employeeID);
        setSalary(salary);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public void work(){
        System.out.println(getName() + " is working");
    }

}

