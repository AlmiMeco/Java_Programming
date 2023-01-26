package day34_oopAbstractionCont.carTask;

public class Audi extends Car{

    public Audi(String model, int year, String color, int price) {
        super(model, year, color, price);
    }


    @Override
    protected void start() {
        System.out.println("Press the Start button to start " + getMake() + " " + getModel());
    }
}
