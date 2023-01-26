package day27_accessModifiers;

public class InstanceBlock {

//    |Instance Block|
    {

        System.out.println("Instance Block");

        name = "Almi";
        age  = 21;
        gender = 'M';
    }

    public String name;
    public int age;
    public char gender;





    public static void main(String[] args) {

        new InstanceBlock();
//        ---> Instance Block

//        |Instance Block can also initialize instance variables|
        InstanceBlock block = new InstanceBlock();
        System.out.println(block.age); // ---> 21
        System.out.println(block.name); // ---> Almi
        System.out.println(block.gender); // ---> M





    }

}
