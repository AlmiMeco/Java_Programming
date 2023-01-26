package day32_finalKeyword;

public class Person { // Super Class ( not final )

    private String name;
    private char gender;
    private static boolean hasHead;

    static { hasHead = true; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, char gender) {
        setName(name);
        setGender(gender);
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food );
    }

}
