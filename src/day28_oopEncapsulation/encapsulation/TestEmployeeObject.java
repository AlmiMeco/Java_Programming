package day28_oopEncapsulation.encapsulation;

public class TestEmployeeObject {

    public static void main(String[] args) {



        Employee employee = new Employee(120000, "Almi", 21, "Java Developer");

        employee.setSalary(120000);
        System.out.println(employee.getSalary());

        employee.setName("Almi");
        System.out.println(employee.getName());

        employee.setAge(21);
        System.out.println(employee.getAge());

        employee.setJobTitle("Java Developer");
        System.out.println(employee.getJobTitle());


        System.out.println("---------------------------------------------------------------------------");

        Employee employee2 = new Employee(115000, "Jenna", 123, "SDET");

        System.out.println(employee2);
//        Invalid Age ... (bc the condition for age is not met you get an error code)


        System.out.println("---------------------------------------------------------------------------");

        Employee employee3 = new Employee(43000, "     ", 42, "Police Officer");

        System.out.println(employee3);
//        ---> Employee Name cannot be empty/blank (condition 'name' is not met)


    }


}
