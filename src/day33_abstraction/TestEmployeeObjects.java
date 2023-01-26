package day33_abstraction;

public class TestEmployeeObjects {


    public static void main(String[] args) {


        Developer developer = new Developer("Almi", "A0313", "SDET", 21, 115000, 'M',
                "C++");

        developer.work();

        System.out.println(developer);


        System.out.println("=========================================================================================");


        Teacher teacher = new Teacher("Almi", "A0312", "Gender Studies", 21, 65000, 'F');

        teacher.work();

        System.out.println(teacher);


        System.out.println("=========================================================================================");


        Driver driver = new Driver("Almi", "A0369", "Transporter", 21, 150000, 'M', "Audi");

        driver.work();

        System.out.println(driver);




    }

}
