package day33_abstraction;

public abstract class Employee {
//      ^^^{abstract keyword required for Class}

    private String name, id, jobTitle;
    private int age, salary;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }


// =====================================================================================================================


    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


// =====================================================================================================================


    public Employee(String name, String id, String jobTitle, int age, int salary, char gender) {
        setName(name);
        setId(id);
        setJobTitle(jobTitle);
        setAge(age);
        setSalary(salary);
        setGender(gender);
    }

//                                        | ABSTRACT METHOD |


    public abstract void work();
//        { no body }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
