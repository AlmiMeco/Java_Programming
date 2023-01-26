package day30_inheritanceCont;

import java.time.LocalDate;

public class TestPersonFamilyObjects {

    public static void main(String[] args) {

        Student student = new Student("Almi", 'M', LocalDate.of(2001 , 3, 13), 'A', "A01");


        President president = new President("Biden", 'M', LocalDate.of(1940, 4,23), LocalDate.of(2020 , 1 , 4));


        Teacher teacher = new Teacher("Emile", 'F', LocalDate.of(1993 , 03, 22), "English Teacher", "J02", 45000);


        System.out.println(student);
        System.out.println(teacher);
        System.out.println(president);

        student.study();
        teacher.teach();
        president.lie();

        System.out.println("----------------------------------------------------------------------------");

        student.drink("RedBull");
        teacher.drink("Coffee");
        president.drink("Crack");
    }

}
