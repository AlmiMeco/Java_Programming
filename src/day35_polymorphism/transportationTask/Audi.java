package day35_polymorphism.transportationTask;

public class Audi extends Transportation implements GasTransport, LandCapable{


    public Audi(String model, String color, int year, int price) {
        super(model, color, year, price);
    }

    @Override
    public void reFueling() { // comes from "GasTransport" Interface

    }

    @Override
    public void Drive() {    // comes from "LandCapable" Interface

    }

    @Override
    public void transportPeople() { // comes from "Transportation" abstract,super class

    }

    @Override
    public void start() {          // comes from "Transportation" abstract,super class

    }

    public static void main(String[] args) {

        //Audi audi = new Audi("Audi", "A6", "Blue", 2019, 20000);
        Audi audi = new Audi("A6", "Blue", 2019, 20000);
        System.out.println(audi);

//        | Generic Method (same output for all subClasses)|
        audi.stop();

    }

}
