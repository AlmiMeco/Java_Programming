package day30_inheritanceCont;

import java.time.LocalDate;
import java.time.LocalDateTime;
                                              /* SINGLE INHERITANCE */
public class Student extends Person {



//    | Instance variables exclusive for Student |
    private char grade;
    private String studentID;


//    | Constructor including parentClass and childClass instance variables |
    public Student(String name, char gender, LocalDate DOB, char grade, String studentID) {
        super(name, gender, DOB);
        setGrade(grade);
        setStudentID(studentID);
    }


//    |Getter & Setter for Student Instance Variables|
    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }


//    | Instance Method for Student subClass |
    public void study(){
        System.out.println(getName() + " is studying");

    }

}
