package day35_polymorphism.transportationTask;

public class Plane extends Transportation implements AirCapable, DieselTransport{

    public Plane(String model, String color, int year, int price) {
        super(model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void reFueling() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}
