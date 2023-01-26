package day30_inheritanceCont;

import java.time.LocalDate;
import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate DOB;

   // private double salary;
   // private String schoolName;

//    ---> not included because these 2 variables don't apply to everyone : only instance variables that apply to the...
//    .... whole CLASS FAMILY should be included in Parent Class

//    | Encapsulation : Getter / Setter |

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Age cannot be negative or zero ");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

//    | Constructor (set age implied implicitly) |

    public Person(String name, char gender, LocalDate DOB) {
        setName(name);
        setGender(gender);
        setDOB(DOB);
        setAge(LocalDate.now().getYear() - DOB.getYear());
    }

//    | toString Method (getClass().getSimpleName() --> toPrint the subClass name (Employee) instead of parentName (Person) every time |

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DOB=" + DOB +
                '}';
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink );
    }
}


