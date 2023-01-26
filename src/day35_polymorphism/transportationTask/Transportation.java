package day35_polymorphism.transportationTask;

public abstract class Transportation {




    private final String make = getClass().getSimpleName(), model;
    private String color;
    private final int year;
    private int price;

//======================================================================================================================

    public Transportation(String model, String color, int year, int price) {
        this.model = model;
        setColor(color);
        this.year = year;
        setPrice(price);
    }

//======================================================================================================================


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//======================================================================================================================

    public abstract void transportPeople();

    public abstract void start();

//    | Generic Method : "Motion/Inertia has come to an end" will always be printed no matter what vehicle |
    public void stop(){
        System.out.println("Motion/Inertia has come to an end");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*  Create an abstract class named Transportation
				Variables:
					make (final), model (final), color, year(final), price
				Encapsulate all the fields
				Add a constructor that can set all the fields
				abstract methods:
					transportPeople();
					start();
				non abstract methods:
					stop(): "Shut off the engine"
					toString()
*/