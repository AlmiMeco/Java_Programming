package day27_accessModifiers;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;

    public static String schoolName;
    public static int zipCode;

    public CydeoStudent(String name, int age, char gender) { // Constructor used to set instance variables
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    static {
        schoolName = "Cydeo School";                                // Static Block used to set static variables
        zipCode    = 37122;
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
