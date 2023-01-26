package day28_oopEncapsulation.encapsulation;

public class Student {

    public int age;

    private String name;

//    |Getter Method|         (reads private data)

    public String getName() {
        return name;
    }

//    |Setter Method|         (writes private data)

    public void setName(String name) {
        this.name = name;
    }

}
