package day34_oopAbstractionCont.carTask;

public class Honda extends Car {


    public Honda(String model, int year, String color, int price) {
        super(model, year, color, price);
    }

    @Override
    protected void start() {
        System.out.println("Insert key and twist to start " + getMake() + " " + getModel());
    }
}
