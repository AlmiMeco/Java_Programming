package day34_oopAbstractionCont.carTask;

public abstract class Car {

    private final String make, model;
    private final int year;
    private String color;
    private int price;

//======================================================================================================================

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            System.out.println("Invalid Price: Price must be above Zero");
            System.exit(1);
        } else {
            this.price = price;
        }
    }

//======================================================================================================================

    public Car(String model, int year, String color, int price) {
        this.make = getClass().getSimpleName(); // set the class name as make of car
        this.model = model;

        if (year <= 1886) {
            System.out.println("Invalid Year");
            System.exit(1);
        }
        this.year = year;

        setColor(color);
        setPrice(price);
    }

//======================================================================================================================

   protected final void stop(){
       System.out.println("Press the brake to stop " + make + " " + model);
   }

   protected abstract void start();


    @Override
    public String toString() {
        return make + "{" +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price= $" + price +
                '}';
    }
}
/* Create an abstract class named Car
			variables:
				make (final), model (final), color, year (final), price
			Encapsulate all the fields
				Conditions:
					1. year can not be less than 1886
					2. price can not be negative or zero
			Add a constructor that can set all the fields
				Note: Class name can be set to the make of the car
			Methods:
				stop() (final): prints "Press the brake"
				start() (abstract)
				toString(): prints the given car info when a car object is passed in the print statement
*/