package day17_customClass;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee(); // declaring employee one

        employee1.setInfo("Almi", "JAVA DEVops", "A0153z", 21, 'M', 110000);
                                      // assigning values to Instance Variables (allowed by setInfo method)

        System.out.println(employee1);  // printing out employee1 attributes (allowed by toString() method)

        employee1.callOut();  //                                                            Instance Method




    }

}
