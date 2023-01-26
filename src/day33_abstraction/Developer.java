package day33_abstraction;

public class Developer extends Employee{


    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }


    public Developer(String name, String id, String jobTitle, int age, int salary, char gender, String programmingLanguage) {
        super(name, id, jobTitle, age, salary, gender);
        setProgrammingLanguage(programmingLanguage);
    }


    @Override
    public void work() {
        System.out.println(getName() + " is coding in " + programmingLanguage);
    }


    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
