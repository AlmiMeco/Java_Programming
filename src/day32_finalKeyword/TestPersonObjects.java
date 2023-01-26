package day32_finalKeyword;

public class TestPersonObjects {


    public static void main(String[] args) {


        Person person = new Person("Almi", 'M');
        System.out.println(person);


        Employee employee = new Employee("Almi", 'M', "Java SDET", 150000);
        System.out.println(employee);

    }

}
