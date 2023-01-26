package day31_methodOverriding.shape_methodOverriding;

public class Shape {

    private String name;
    private int sides;
    private int corners;


    public Shape(String name, int sides, int corners) {
        setName(name);
        setSides(sides);
        setCorners(corners);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getCorners() {
        return corners;
    }

    public void setCorners(int corners) {
        this.corners = corners;
    }

    public double area() {

        return 0;
    }

    public double perimeter() {
        return 0;
    }

    public void draw() {

    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", sides=" + sides +
                ", corners=" + corners +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
