package day30_inheritanceCont;

import java.time.LocalDate;
import java.time.LocalDateTime;
                                         /* Multi-Level Inheritance */
public class Teacher extends Employee {

    public void teach(){
        System.out.println(getName() + " is teaching");
    }

    public Teacher(String name, char gender, LocalDate DOB, String jobTitle, String employeeID, int salary) {
        super(name, gender, DOB, jobTitle, employeeID, salary);
    }
}
