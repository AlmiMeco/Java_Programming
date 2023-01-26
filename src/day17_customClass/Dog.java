package day17_customClass;

public class Dog { // custom class

//    no main method will be created we are creating our OWN class

//    |Instance Variables| (attributes)

    public String name;
    public String breed;
    public String color;
    public String size;
    public int age;

//    |Instance Methods |

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking water");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

//    .toString() method is required to print custom classes in the command line (avoid hash error when printing obj)

    public String toString() {
        return "Dog" +
                " name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age ;

    }

//    |Creating a custom class to automate (Instance) variable assignment |

    public void setDogInfo(String name, String breed, String color, String size, int age){
        this.name = name;     // this. method is used to assign a variable name to the instance variable
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.age = age;
    }
}
