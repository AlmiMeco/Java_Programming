package day25_constructor;

public class TestEmployeeObjects {

    public static void main(String[] args) {



        Employee employee1 = new Employee("Almi", "Java Developer", "11/25/22", 21, 'M',115000);
        System.out.println(employee1);
        System.out.println(employee1.salary);

        System.out.println("-----------------------------------------------------------------------------------------");

        Employee employee2 = new Employee("Devon", "Manager", "02/04/18", 38, 'M', 163000);
        System.out.println(employee2);
        System.out.println(employee2.salary);

        System.out.println("-----------------------------------------------------------------------------------------");

        Employee employee3 = new Employee("Sara", "Personal Assistan", "07/05/21", 27, 'F', 60000);
        System.out.println(employee3);
        System.out.println(employee3.salary);




    }

}
