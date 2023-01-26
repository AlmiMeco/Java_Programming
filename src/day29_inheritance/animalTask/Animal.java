package day29_inheritance.animalTask;

public class Animal {        // | Parent Class |

    public String name;
    public String breed;
    public char gender;
    public String size;
    public String color;
    public int age;

    public void setInfo(String name, String breed, char gender, String size, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.color = color;
        this.age = age;
    }


    public String toString() {
        return getClass().getSimpleName() + "{" + // to output the Child name instead of 'Animal' for each class
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat() {
        System.out.println(this.name + " is eating");
    }

    public void sleep() {
        System.out.println(this.name + " is sleeping");
    }

    public void drink() {
        System.out.println(this.name + " is drinking");
    }


}
/* attributes:
					name, breed, gender, size, color, age
			methods:
				setInfo(), eat(), sleep(), drink(), toString()
*/