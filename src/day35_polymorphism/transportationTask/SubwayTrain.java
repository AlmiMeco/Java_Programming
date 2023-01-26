package day35_polymorphism.transportationTask;

public class SubwayTrain extends Transportation implements ElectricTransport, LandCapable{

    public SubwayTrain(String model, String color, int year, int price) {
        super(model, color, year, price);
    }

    @Override
    public void reCharging() {

    }

    @Override
    public void Drive() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}
