package day27_accessModifiers;

public class TestCydeoStudentObjects {

    public static void main(String[] args) {



        CydeoStudent student1 = new CydeoStudent("Almi", 21, 'M');
        CydeoStudent student2 = new CydeoStudent("Sami", 23, 'F');

        System.out.println(student1);
        System.out.println(student2);

//        |Called using Static Block|
        System.out.println(student1.zipCode);
        System.out.println(student1.schoolName);

        System.out.println(student2.schoolName);
        System.out.println(student2.zipCode);

        System.out.println(CydeoStudent.schoolName);
        System.out.println(CydeoStudent.zipCode);







    }

}
